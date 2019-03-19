package New;

public class ArrayFound {
		public static void main(String[] args) {
			boolean flag = false;
			String str="shiva";
		String[] name = {"Shiva", "Akhil", "vineeth", "siva"};
		for (int i=0;i<name.length;i++) {
			if (name[i].equalsIgnoreCase(str)) {
		  flag=true;
		  break;
		    }
		    else
	 {
		  flag=false;
		  break;
		  
		}
			
		}
		if(flag==true)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("Not Found");
}
}
}
