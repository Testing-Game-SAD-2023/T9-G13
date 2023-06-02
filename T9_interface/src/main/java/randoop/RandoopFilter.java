package randoop;

import exceptions.RandoopException;
import java.io.File;
public class RandoopFilter {
    private String className;
    private String class_file_path;

    private static final String shared_dir_path = "/Users/rosariaritacanale/Downloads/shared_dir";

    public RandoopFilter(String className){
        this.className = className;
        class_file_path = shared_dir_path + "/"+className.toLowerCase();
    }

    private void checkClassName() throws RandoopException{
        File f = new File(class_file_path);
        if(!f.isDirectory()){
            throw new RandoopException("The directory for this class name doesn't exists");
        }
        f = new File(class_file_path + "/" + className + ".java");
        if(!f.exists()){
            throw new RandoopException("The file for this class name doesn't exists");
        }
    }
    private void checkClassCompile() throws Exception{
        Process p = Runtime.getRuntime().exec("javac " + class_file_path + "/" + className + ".java");
        p.getErrorStream().transferTo(System.out);
        if(p.waitFor() != 0){ //TODO
            throw new RandoopException("Unable to compile the class !!\n");
        }
        p = Runtime.getRuntime().exec("rm -f " + class_file_path + "/" + className + ".class");
    }

    public void filter() throws Exception{
        checkClassName();
        checkClassCompile();
    }

}
