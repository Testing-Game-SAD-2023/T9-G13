package randoop;

import exceptions.RandoopException;

public interface IRandoopConnector {
    public void generateRandoopTest(String className) throws RandoopException;
}
