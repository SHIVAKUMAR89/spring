package MovieAsn;

import java.util.Scanner;
import java.util.regex.Pattern;


public class MovieDemo {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	Movie a[]=null;
	while(true) {
	System.out.println("1 Enter the no of objects \n"+"2 for displaying\n"+"3 for exit");
	int option=scan.nextInt();
	switch(option) {
	case 1:addMovie(a);
			break;
	case 2:displayMovie(a);
	break;
	case 3:
		System.exit(0);
	break;
	default : System.out.println("please enter correct option");
	}
}
}
	public static Movie[] addMovie(Movie[] a)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of objects \n");
	int count=scan.nextInt();
		a=new Movie[count];
		int noOfAttempts=0;
    for(int i=0;i<count;i++) {
	System.out.println("Enter the Movie id");
	int movieId=scan.nextInt();
	
	
	System.out.println("Enter the movie name");
	String name=scan.next();
	
	
	System.out.println("Enter the duration");
	double duration=scan.nextInt();
	
	Movie a1=new Movie();
   // System.out.println("total no objects="+Movie.getcount());	
	a1.setMovieId(movieId);
	a1.setName(name);
	a1.setDuration(duration);
	a[i]=a1;
   a1.getMovieDetails();
   }
    return a;
	
}
	public static void displayMovie(Movie[] a)
	{
		System.out.println("the array is"+a);
		if(a!=null) {
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	}
		else
		{
			System.out.println("no object displayed");
		}
	}
	public static boolean validateName(String name) {
		if(Pattern.matches("^[A-Za-z]+$",name))
			return true;
		else
			return false;
	}
	public static boolean validateMovieId(String movieId) {
		if(Pattern.matches("^[0-9]+$",movieId))
			return true;
		else
			return false;
	}


}
	


