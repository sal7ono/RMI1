
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sal7o
 */
public class ServeurRMI extends UnicastRemoteObject implements Interface {
    Hashtable<Client,Compte> GestionCompte= new Hashtable<Client,Compte> ();
    protected ServeurRMI()throws RemoteException
  {super();
  }
  
     @Override
    public void CreerCompte(Client c,Compte cp)throws RemoteException
    {
        
         GestionCompte.put(c, cp);
         
         
    }
    @Override
    public float Affichesolde(Client c) throws RemoteException {
              return GestionCompte.get(c).getSolde(); 
    }

    @Override
    public void AjoutSolde(Client c, float a) throws RemoteException {
        GestionCompte.get(c).AjouterSolde(a);
            
        
    }

    @Override
    public void RetraitSolde(Client c, float r) throws RemoteException {
       GestionCompte.get(c).RetraitSolde(r);
    }
    public static void main(String[] args) {
        try
        {
            ServeurRMI serv1 =new ServeurRMI();
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            Naming.rebind("serv1",serv1);
            
            System.out.println("Connexion serveur est prete ");
        }
        catch(Exception e)
        {
          System.out.println("Exception produite coté serveur !!! ");
        }
    

    
    }


}

