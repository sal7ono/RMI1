
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sal7o
 */
public class Compte implements Serializable{
     private int num;
  public float Solde;
  
  public Compte(int num,float solde)
  {
      this.num=num;
    
      this.Solde=solde;
  }
    public float getSolde() {  return Solde; }
    public void AjouterSolde(float ajout) {Solde+=ajout;}
    public void RetraitSolde(float retrait) {Solde-=retrait;}
    
}
