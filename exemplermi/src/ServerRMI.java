import java.rmi.*;
import java.rmi.server.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sal7o
 */
public class ServerRMI extends UnicastRemoteObject implements Interfaces {
  protected ServerRMI()throws RemoteException
  {super();}
  @Override
  public int Additionner(int a, int b)throws RemoteException
  {return(a+b);}
  @Override
  public int Multiplier(int a, int b)throws RemoteException
  {return(a*b);}
  @Override
  public int Soustraire(int a, int b)throws RemoteException
  {return(a-b);}
  @Override
  public int Diviser(int a, int b)throws RemoteException
  {return(a/b);}
  public static void main(String[] args)
  { try
  { ServerRMI serv1 =new ServerRMI();
  java.rmi.registry.LocateRegistry.createRegistry(1099);
  Naming.rebind("serv1", serv1);
  System.out.println("Connexion serveur est prete");
  }   catch (Exception e) {
          System.out.println("Exception produite coté serveur !!!");
      }
  }
}
