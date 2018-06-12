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
public interface Interfaces extends Remote {
    public int Additionner (int a,int b) throws RemoteException;
     public int Multiplier (int a,int b) throws RemoteException;
      public int Soustraire (int a,int b) throws RemoteException;
       public int Diviser (int a,int b) throws RemoteException;
}
