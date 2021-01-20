//Java Interface File to achieve a higher level of abstraction.
import java.rmi.RemoteException;
import java.io.IOException;

public interface TicTacToe extends java.rmi.Remote {
    public void joinGame(TicTacToe client) throws RemoteException ;
    public int sendMessage(String message) throws RemoteException, IOException ;
}
