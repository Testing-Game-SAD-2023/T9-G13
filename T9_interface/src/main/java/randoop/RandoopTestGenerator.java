package randoop;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import org.apache.commons.io.FileUtils;

public class RandoopTestGenerator extends Thread{

    private RandoopConnector randoopConnector;
    private static final String START_DIR = "/home/tesi-step/Desktop/git/T9-G13"; //va modificata
    private static final String SHARED_DIR = START_DIR + "/shared_dir";
    private final String INPUT_CLASSNAME;
    private final String LOWER_CLASSNAME;
    private final String CLASS_PATH_BASE;
    private final String TEST_PATH_BASE;
    private final String PROJECT_DIR;
    private final String MAIN_DIR;
    private final String TEST_DIR;
    private int maxNumberLevel;
    private int threadIndex;


    public RandoopTestGenerator(String className, RandoopConnector randoopConnector, int maxNumberLevel, int threadIndex){
        this.randoopConnector = randoopConnector;
        this.maxNumberLevel = maxNumberLevel;
        this.threadIndex = threadIndex;
        INPUT_CLASSNAME = className;
        LOWER_CLASSNAME = className.toLowerCase();
        PROJECT_DIR = START_DIR + "/projects/project_"+threadIndex;
        MAIN_DIR = PROJECT_DIR + "/src/main/java";
        TEST_DIR = PROJECT_DIR + "/src/test/java";
        CLASS_PATH_BASE = SHARED_DIR + "/" + LOWER_CLASSNAME;
        TEST_PATH_BASE = CLASS_PATH_BASE + "/" + LOWER_CLASSNAME + "_randoop";
    }

    private void randoop(int timeLimit, String nomeRegr, String nomeErr, int seed) throws IOException, InterruptedException {
        //System.out.println("[DEBUG] TIME: " + timeLimit + " SEED: " + seed);
        //SE VA SU WINDOWS NECESSARIO MODIFICARE SEPARATORE DEL CLASSPATH
        String cmd = "cd " + PROJECT_DIR + " && mvn compile && java -classpath ../randoop-all-4.3.2.jar:./target/classes/ randoop.main.Main gentests"
                + " --testclass=" + INPUT_CLASSNAME
                + " --time-limit=" + timeLimit
                + " --regression-test-basename=" + nomeRegr
                + " --error-test-basename=" + nomeErr
                + " --randomseed=" + seed
                + " --junit-output-dir=" + TEST_DIR
                + " && mvn test";


        String[] commands = {"/bin/bash", "-c", cmd};
        Process process = Runtime.getRuntime().exec(commands);
        process.getErrorStream().transferTo(System.out);
        //process.getInputStream().transferTo(System.out);
        process.waitFor();

    }

    private int runTest() throws IOException, InterruptedException {
        int i = 0;
        int testForSession = 0;
        int dirNum = 1;
        double coverage = 0;
        double oldCoverage = 0;
        int maxTestForSession = 2;
        int I_MAX = 5;
        double DELTA = 0.05;
        int time = 5;
        boolean newIteration = true;
        int inst_missed=0, inst_covered=0;
        String[] result ={"",""};

        while (newIteration) {
            String nomeErr = "ErrorL" + dirNum + "T" + testForSession + "Test";
            String nomeRegr = "RegressionL" + dirNum + "T" + testForSession + "Test";

            //String sessionDir = "session" + dirNum;
            randoop(time, nomeRegr, nomeErr, new Random().nextInt(100) + 1);

            testForSession = (testForSession + 1) % maxTestForSession;

            String line = "";
            String splitBy = ",";
            String csvFilePath = PROJECT_DIR + "/target/my-reports/jacoco.csv";
            BufferedReader br = new BufferedReader(new FileReader(csvFilePath));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                result = line.split(splitBy);    // use comma as separator
            }
            inst_missed = Integer.parseInt(result[3]);
            inst_covered = Integer.parseInt(result[4]);
            coverage = (double) inst_covered/ (inst_missed + inst_covered);
            if (Math.abs(oldCoverage - coverage) <= DELTA) {
                i++;
            } else {
                i = 0;
            }
            oldCoverage = coverage;

            newIteration = (coverage <= 0.95) && (i < I_MAX - 1) && (dirNum<= maxNumberLevel);

            if (testForSession == 0 || !newIteration) {
                time = incrementTime(time);
                saveTests(dirNum);
                dirNum++;
            }
        }

        return dirNum-1;
    }

    private void saveTests(int dirNum) throws IOException {
        String sessionDir = TEST_PATH_BASE + "/session_"+dirNum;
        Path sessionDirPath = Paths.get(sessionDir);
        Files.createDirectory(sessionDirPath);

        String sourceDir = TEST_DIR;

        File dir = new File(TEST_DIR);
        File[] files = dir.listFiles((dir1, name) -> {
            return name.contains("L"+dirNum);
        });
        for(File f : files) {
            FileUtils.copyFileToDirectory(f, new java.io.File(sessionDir));
        }
    }

    private void initTest() throws IOException {
        String inputClassFilePath = CLASS_PATH_BASE +"/" + INPUT_CLASSNAME +".java";
        String destinationDir = MAIN_DIR;
        FileUtils.copyFileToDirectory(new java.io.File(inputClassFilePath), new java.io.File(destinationDir));

        String randoopDir = CLASS_PATH_BASE +"/" + LOWER_CLASSNAME+"_randoop/";
        Path randoopPath = Paths.get(randoopDir);
        if(Files.notExists(randoopPath))
            Files.createDirectory(randoopPath);
	
        String cleanCommand = "/bin/bash "+ "-c "+"cd " + PROJECT_DIR + " && mvn clean";

        try {
            Process process = Runtime.getRuntime().exec(cleanCommand);
            process.getErrorStream().transferTo(System.out);
            process.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void cleanDir() throws IOException {
        String cleanCommand = "/bin/bash "+ "-c "+"cd " + PROJECT_DIR + " && mvn clean";
        try {
            Process process = Runtime.getRuntime().exec(cleanCommand);
            process.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String mainJavaFilesPattern = MAIN_DIR + "/";
        String testJavaFilesPattern = TEST_DIR + "/";
        String targetJavaFilesPattern = PROJECT_DIR + "/target/";//aggiunta

        //cancella i file corretti?
        
        FileUtils.cleanDirectory(new File(mainJavaFilesPattern));
        FileUtils.cleanDirectory(new File(testJavaFilesPattern));
        FileUtils.cleanDirectory(new File(targetJavaFilesPattern)); //aggiunta
    }

    private int incrementTime(int time) {
        int TIME_MAX = 100;
        int TIME_INCR = 5;
        if (time < TIME_MAX) {
            time += TIME_INCR;
        } else {
            time += 1;
        }
        return time;
    }

    private void randoopGenerate() throws Exception{
        initTest();
        int nSessions = runTest();
        cleanDir();
        randoopConnector.operationCompleted(nSessions,INPUT_CLASSNAME,threadIndex);

    }

    //vedi bene il nome del metodo da implemntare
    public void run(){
        try {
            randoopGenerate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
/*
    public static void main(String args[]){
        RandoopTestGenerator r = new RandoopTestGenerator("VCardBean", null);
        r.start();
    }
*/
}
