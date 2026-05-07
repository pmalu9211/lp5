import java.rmi.*;

interface ServerIntf extends Remote {

    public double convertMilesToKilometer(double miles) throws RemoteException;
}
