import java.rmi.*;

interface ServerIntf extends Remote {

    public int countVowels(String word) throws RemoteException;
}
