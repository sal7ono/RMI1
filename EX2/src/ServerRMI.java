import java.rmi.*;
import java.rmi.server.*;
import java.util.ArrayList;

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

public int nombrepos(ArrayList <coordonne> al) throws RemoteException
{ 
   
    
    return(al.size());
    
}
  @Override
  @SuppressWarnings("element-type-mismatch")
 public boolean chercherpos(ArrayList<coordonne> c,String nom) throws RemoteException
 { return(c.contains(nom));}
  @Override
   public void lecturepos(ArrayList<coordonne> c) throws RemoteException
   {for(int i=0;i<c.size();i++)
       System.out.println("la"+i+"="+c.get(i));
   }
  @Override
   public void createpos(ArrayList<coordonne> c,int x ,int y,String n) throws RemoteException
   { c.add(new coordonne(x,y,n));
   }
  @Override
   public void detruirepos(ArrayList<coordonne> c,int pos) throws RemoteException
   {c.remove(pos);}
  

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
