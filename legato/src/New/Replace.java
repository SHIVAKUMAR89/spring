package New;

public class Replace {

	public static void main(String args[]) {
		String str= "Shiva kumar";
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)!=' ') {
			str=str.replace(str.charAt(i),'I');
		}
			else {
				str=str.replace(str.charAt(i),' ');
			}
		}
		//String replaceString=s1.replaceAll("[A-Za-z]","I");
		System.out.println(str);
	
	   }
	}

			


