
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
public class ClientRMI  {
    public static void main(String[] args){
         
   
  try
  {Remote r= Naming.lookup("serv1");
 Client c = new Client();
   Compte cp= new Compte(111,22);
   if (r instanceof Interface)
  { ((Interface)r).CreerCompte(c, cp);
  System.out.println("*****************************");
  ((Interface)r).AjoutSolde(c, 323);
      
  System.out.println("le solde ="+((Interface)r).Affichesolde(c));
  
  
  ((Interface)r).RetraitSolde(c, 2);}

  }
  
  catch (Exception e)
  {System.out.println("Exception produite coté client !!!"+e);}
  }
}


