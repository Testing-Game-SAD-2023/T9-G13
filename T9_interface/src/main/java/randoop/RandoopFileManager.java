package randoop;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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


    public void saveTests(int dirNum) throws IOException {
        String dirName = ((dirNum <10) ? "0"+dirNum : Integer.toString(dirNum))+"Level";
        String sessionDir = TEST_PATH_BASE + "/"+dirName+"/TestSourceCode";
        Path sessionDirPath = Paths.get(sessionDir);
        Files.createDirectory(sessionDirPath);

        File dir = new File(TEST_DIR);
        File[] files = dir.listFiles((dir1, name) -> {
            return name.contains("L"+dirNum);
        });
        for(File f : files) {
            FileUtils.copyFileToDirectory(f, new java.io.File(sessionDir));
        }
    }

    public void initTest() throws IOException {
        String inputClassFilePath = CLASS_PATH_BASE +"/" + INPUT_CLASSNAME +".java";
        String destinationDir = MAIN_DIR;
        FileUtils.copyFileToDirectory(new java.io.File(inputClassFilePath), new java.io.File(destinationDir));

        Path folderPath = Paths.get(TEST_PATH_BASE);
        if(Files.notExists(folderPath))
            Files.createDirectory(folderPath);

        String cleanCommand = "/bin/bash "+ "-c "+"cd " + PROJECT_DIR + " && mvn clean";

        try {
            Process process = Runtime.getRuntime().exec(cleanCommand);
            process.getErrorStream().transferTo(System.out);
            process.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

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
        String targetJavaFilesPattern = PROJECT_DIR + "/target/";//aggiunta

        //cancella i file corretti?

        FileUtils.cleanDirectory(new File(mainJavaFilesPattern));
        FileUtils.cleanDirectory(new File(testJavaFilesPattern));
        FileUtils.cleanDirectory(new File(targetJavaFilesPattern)); //aggiunta
    }

}
