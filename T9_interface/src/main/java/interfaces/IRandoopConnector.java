package interfaces;

import exceptions.RandoopException;

public interface IRandoopConnector {
    public void generateRandoopTest(String className, IObserver o) throws Exception;

}
