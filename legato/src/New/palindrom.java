package New;

public class palindrom {
	 static boolean checkPalindrome(String str){ 
	      
		    int n = str.length();  
		    int count = 0; 
		      
		    for (int i = 0; i < n/2; ++i) 
		      
		        if (str.charAt(i) != str.charAt(n - i - 1))  
		            ++count;   
		    return (count <= 1); 
	    } 

public static void main(String[] args) { 
    
    String str = "nayan";  
          
    if (checkPalindrome(str)) 
      
        System.out.println("palindrome"); 
    else
        System.out.println("Not palindrome"); 
          
    } 
      
} 