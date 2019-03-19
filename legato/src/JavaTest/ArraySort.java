package JavaTest;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArraySort {
	public static void main(String args[]){
		   List<String> al = new LinkedList<String>();
		   al.add("India");
		   al.add("US");
		   al.add("China");
		   al.add("Brazil");
		   
		  
		   System.out.println("Before Sorting:");
		   for(int i=0;i<al.size();i++){
				System.out.println(al.get(i));
			}

		   Collections.sort(al);

		   System.out.println("After Sorting:");
		   for(int i=0;i<al.size();i++){
				System.out.println(al.get(i));
			}
		}
	}


