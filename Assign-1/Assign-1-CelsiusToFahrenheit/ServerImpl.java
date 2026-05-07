import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

    public ServerImpl() throws RemoteException {

    }

    public double convertTemperature(double celsius) throws RemoteException {

        return (celsius * 9 / 5) + 32;
    }
}
