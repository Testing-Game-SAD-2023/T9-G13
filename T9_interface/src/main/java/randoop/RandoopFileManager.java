package randoop;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class RandoopFileManager {
    private String START_DIR;
    private String REPOSITORY;
    private final String INPUT_CLASSNAME;
    private final String LOWER_CLASSNAME;
    private final String CLASS_PATH_BASE;
    private final String TEST_PATH_BASE;
    private final String PROJECT_DIR;
    private final String MAIN_DIR;
    private final String TEST_DIR;

    public RandoopFileManager(String START_DIR, String className, int threadIndex){
        this.START_DIR = START_DIR;
        this.REPOSITORY= START_DIR + "/repository";
        INPUT_CLASSNAME = className;
        LOWER_CLASSNAME = className.toLowerCase();
        PROJECT_DIR = START_DIR + "/projects/project_"+threadIndex;
        MAIN_DIR = PROJECT_DIR + "/src/main/java";
        TEST_DIR = PROJECT_DIR + "/src/test/java";
        CLASS_PATH_BASE = REPOSITORY + "/" + INPUT_CLASSNAME+"/"+INPUT_CLASSNAME+"SourceCode";
        TEST_PATH_BASE = REPOSITORY + "/" + INPUT_CLASSNAME+"/RobotTest/RandoopTest";
    }

    private void copyWithPattern(String src, String dst,String pattern)throws IOException{
        File dir = new File(src);
        File[] files = dir.listFiles((dir1, name) -> {
            return name.contains(pattern);
        });
        for(File f : files) {
            FileUtils.copyFileToDirectory(f, new java.io.File(dst));
        }
    }

    public void saveTests(int dirNum, boolean savePrev) throws IOException {
        String dirName = ((dirNum <10) ? "0"+dirNum : Integer.toString(dirNum))+"Level";
        String sessionDir = TEST_PATH_BASE + "/"+dirName+"/TestSourceCode";
        Path sessionDirPath = Paths.get(sessionDir);
        Files.createDirectories(sessionDirPath); //gestione delle cartelle necessarie al salvataggio dei test




        //due possibili comportamenti
        //  1) qunado savePrev == true inseriamo nel livello dirNum tutti i file generati fino a quel momemento
        //  2) quando savePrev == false inseriamo nel livello dirNum solo i file generati per lo specifico livello
        if( savePrev){
            for(int i=1 ; i  <= dirNum ; i++){
                copyWithPattern(TEST_DIR,sessionDir,"L"+i);
            }
        }else{
            copyWithPattern(TEST_DIR,sessionDir,"L"+dirNum);
        }

        
    }

    public void initTest() throws IOException {
        String inputClassFilePath = CLASS_PATH_BASE +"/" + INPUT_CLASSNAME +".java";
        String destinationDir = MAIN_DIR;
        FileUtils.copyFileToDirectory(new java.io.File(inputClassFilePath), new java.io.File(destinationDir));

        Path folderPath = Paths.get(TEST_PATH_BASE);
        Files.createDirectories(folderPath);

        String cleanCommand = "/bin/bash "+ "-c "+"cd " + PROJECT_DIR + " && mvn clean";

        try {
            Process process = Runtime.getRuntime().exec(cleanCommand);
            process.getErrorStream().transferTo(System.out);
            process.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void selectTest(int nMaxTest, int testExceeded) throws IOException{

        int ampiezzaIntervallo = testExceeded/nMaxTest;
        int testToSave=2;
        Random rand = new Random();
        String dirName = ((nMaxTest <10) ? "0"+nMaxTest : Integer.toString(nMaxTest))+"Level";
        String src = TEST_PATH_BASE + "/"+dirName+"/TestSourceCode";
        String dest;
        /*
         * ampiezza = test
         *
         */
        int selectedTest = 0;
        for(int i=0 ; i < nMaxTest-1 ; i++){
           //k=2 numero randomico tra i*ampiezza_intervallo e (i+1)*ampiezza_intervallo-1
            for(int j=0 ; j < testToSave ; j++){
                selectedTest=i*ampiezzaIntervallo+rand.nextInt(ampiezzaIntervallo);
                for(int k=nMaxTest; k > i ; k--){
                    dirName =  ((k <10) ? "0"+k : Integer.toString(k))+"Level";
                    dest = TEST_PATH_BASE + "/"+dirName+"/TestSourceCode";
                    copyWithPattern(src, dest, "T"+selectedTest+"Test");
                }
            }
        }
        //eliminiamo la cartella in più
        //FileUtils.cleanDirectory(new File(src));
        FileUtils.deleteDirectory(new File(src));



                /*
                 * nTest -> numero di test in cartella nMaxTest
                 * suddividere i test in nTest/nLevelGenerated sessioni
                 *   per ogni sessione scegliamo un numero di test da prelvare e lo facciamo in modo casuale
                 *      ....
                 * 
                 */
    } 
    
    //svuota la cartella del progetto utilizzato per un futuro utilizzo
    public void cleanDir() throws IOException {
        String cleanCommand = "/bin/bash "+ "-c "+"cd " + PROJECT_DIR + " && mvn clean";
        try {
            Process process = Runtime.getRuntime().exec(cleanCommand);
            process.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String mainJavaFilesPattern = MAIN_DIR + "/";
        String testJavaFilesPattern = TEST_DIR + "/";
        String targetJavaFilesPattern = PROJECT_DIR + "/target/";


        FileUtils.cleanDirectory(new File(mainJavaFilesPattern));
        FileUtils.cleanDirectory(new File(testJavaFilesPattern));
        FileUtils.cleanDirectory(new File(targetJavaFilesPattern));
    }

}
