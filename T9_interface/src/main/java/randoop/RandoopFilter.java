package randoop;

import exceptions.RandoopException;
import java.io.File;
import java.io.IOException;

public class RandoopFilter {
    private String className;
    private String class_file_path;

    private static final String shared_dir_path = "/Users/rosariaritacanale/git/T9-G13/shared_dir";

    public RandoopFilter(String className){
        this.className = className;
        class_file_path = shared_dir_path + "/"+className.toLowerCase();
    }

    private void checkClassName() throws RandoopException{
        File f = new File(class_file_path);
        if(!f.isDirectory()){
            throw new RandoopException("The directory: "+class_file_path+" for this class name doesn't exists",RandoopException.DIR_ERROR);
        }
        f = new File(class_file_path + "/" + className + ".java");
        if(!f.exists()){
            throw new RandoopException("The file for this class name doesn't exists",RandoopException.CLASS_NOT_FOUND);
        }
    }
    private void checkClassCompile() throws RandoopException,IOException,InterruptedException {

        Process p = Runtime.getRuntime().exec("javac " + class_file_path + "/" + className + ".java");
        p.getErrorStream().transferTo(System.out);
        p.waitFor();
        if(p.exitValue() != 0){ //TODO
            throw new RandoopException("Unable to compile the class !!\n",RandoopException.CLASS_NO_COMPILE);
        }
        p = Runtime.getRuntime().exec("rm -f " + class_file_path + "/" + className + ".class");
    }

    public void filter() throws RandoopException,IOException,InterruptedException{
        checkClassName();
        checkClassCompile();
    }

}
