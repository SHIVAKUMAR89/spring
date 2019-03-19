package Exception;

public class AgeInvalidException extends Exception{
	String age;
	AgeInvalidException(String age){ 
	super();
	this.age=age;
	}
	@Override
public String getMessage() {
		System.out.println("Inside msg");
		return age;
	}
}


