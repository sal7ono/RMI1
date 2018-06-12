
import java.rmi.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sal7o
 */
public interface Interface extends Remote {
     public void CreerCompte(Client c,Compte cp) throws RemoteException;

    /**
     *
     * @param c
     * @return
     * @throws RemoteException
     */
    public float Affichesolde(Client c) throws RemoteException;
   public void AjoutSolde(Client c,float a) throws RemoteException;
   public void RetraitSolde(Client c,float r) throws RemoteException;
}
    

