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
public class Client1 {
  public static void main(String[] args)
  { int a=5;
  int b=3;
      try
  {Remote r= Naming.lookup("serv1");
  if (r instanceof Interfaces)
  {System.out.println(+a+"+"+b+"="+((Interfaces)r).Additionner(a,b));
  System.out.println(+a+"*"+b+"="+((Interfaces)r).Multiplier(a,b));
  System.out.println(+a+"-"+b+"="+((Interfaces)r).Soustraire(a,b));
  System.out.println(+a+"/"+b+"="+((Interfaces)r).Diviser(a,b));
  }
  }
  catch (Exception e)
  {System.out.println("Exception produite coté client !!!");}
  }
}
