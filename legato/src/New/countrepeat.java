package New;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//import java.util.Scanner;

public class countrepeat {
		  public static void main(String[] args) {
			    String s="welcome to legato";
			    Map hs=new LinkedHashMap();
			    //int count = 0 ;

			    for (int i = 0; i <=s.length()-1; i++) {
			    	 int count = 0 ;
			        for (int j = 0; j < s.length(); j++) {

			            if(s.charAt(i)==s.charAt(j))
			            {
			                count++;

			            }
			        }   
			        hs.put(s.charAt(i), count);
			    }
			    Set st=hs.keySet();
			    Iterator itr=st.iterator();
			    while(itr.hasNext()) {
			    	Object obj=itr.next();
			       
			        
			        System.out.println(obj +" "+hs.get(obj));
			      
			        }
			
			    }

			}
			

	

