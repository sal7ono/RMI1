import java.rmi.*;
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
public interface Interfaces extends Remote {
   public int nombrepos(ArrayList<coordonne> c) throws RemoteException;
   public boolean chercherpos(ArrayList<coordonne> c,String nom) throws RemoteException;
   public void lecturepos(ArrayList<coordonne> c) throws RemoteException;
   public void createpos(ArrayList<coordonne> c,int x ,int y,String n) throws RemoteException;
   public void detruirepos(ArrayList<coordonne> c,int pos) throws RemoteException;
   
   
}
