package Exception;

public class NmaeInvalidExceptionion extends Exception{
String msg;
NmaeInvalidExceptionion(String msg){ 
super();
this.msg=msg;
}
@Override
public String getMessage() {
		System.out.println("Inside msg");
		return msg;
	}

}
