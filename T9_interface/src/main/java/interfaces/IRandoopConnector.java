package interfaces;

import exceptions.RandoopException;

public interface IRandoopConnector {
    public void generateRandoopTest(String className) throws RandoopException;
    public void attach(IObserver o, String className);
}
