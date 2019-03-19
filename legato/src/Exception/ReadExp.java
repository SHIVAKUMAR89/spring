package Exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import legato.Circle;
import legato.Square;

public class ReadExp {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			try {
			file();
			}
			catch(FileNotFoundException e)
			{
				System.out.println(e);
			}
			
			Circle c=new Circle();
			c.setRadious(10);
			System.out.println("circle area"+c.caluclateArea());
			
			Square s=new Square();
			s.setLength(10);
			System.out.println("square area"+s.caluclateArea());
		}
			public static void file() throws FileNotFoundException {
			
		
				FileReader r = new FileReader("abc.txt");
				r=null;
				if(r==null)
					throw new IOException();

					
				}
	

			}
