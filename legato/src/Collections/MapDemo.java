package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import bank.Account;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(101,"Shiva");
map.put(102,"Akhil");
map.put(103,"sdfgh");
//map.put(null,"vineeth");
//map.put(null,"arpitha");
System.out.println(map.size());

Set set=map.entrySet();
Iterator it = set.iterator();
while(it.hasNext()) {
	  System.out.println(it.next());

	  //Set set1=map.keySet();
	  //Iterator it1 = set.iterator();
	//  while(it1.hasNext()) {
		 // Integer i=(Integer)it1.next();
	  	 // System.out.println(it1.next());
	  
System.out.println("key="+it.next()+"value="+map.get(103));
}
}
}
