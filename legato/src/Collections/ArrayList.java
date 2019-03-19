package Collections;
import java.util.*;

import bank.Account;

public class ArrayList {
	   public static void main(String args[]){  
	      //Set al =new HashSet();
		   //List al=new LinkedList();
	     Set<Account> al =new TreeSet<Account>();
	      al.add(new Account());
	      al.add(new Account());
	      al.add(new Account());
	     //al.add(19);
	     
	      Iterator<Account> i = al.iterator();
	      while(i.hasNext()) {
	    	  System.out.println(i.next());
	      }
	   
	      //System.out.println(al.get(2));
	   }  
	}
