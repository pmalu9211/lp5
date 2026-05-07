import java.rmi.*;

interface ServerIntf extends Remote {

    public double convertTemperature(double celsius) throws RemoteException;
}
