import java.net.MalformedURLException;
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
public class Client {
  public static void main(String[] args)
  { ArrayList<coordonne> c = new ArrayList();
      try
  {Remote r= Naming.lookup("serv1");
  if (r instanceof Interfaces)
  { ((Interfaces)r).nombrepos(c);
   ((Interfaces)r).chercherpos(c, "a");
   ((Interfaces)r).createpos(c, 1, 2, "a");
   ((Interfaces)r).lecturepos(c);
   ((Interfaces)r).detruirepos(c, 1);
  }
  }
  catch (Exception e)
  {System.out.println("Exception produite coté client !!!"+e);}
  }
}
