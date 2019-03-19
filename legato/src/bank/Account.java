package bank;

public class Account {
	    private String accountNo;
	    private double balance;
	    private Person accountHolder; 
	    private static int count=1001;

	    public long getAcNo() {
	        return accountNo;
	     }
	    public long setAcNo(String accountNo) {
	        this.accountNo=accountNo;
	     }
	    public double getBalance() {
	        return balance;
	     }
	    public double setBalance(double balance) {
	        this.balance=balance;
	     }
	    public Person getAccHolder() {
	        return accountHolder;
	     }
	    public Person setAccHolder(double accountHolde) {
	        this.accountHolder=accountHolder;
	     }
	    
	    public void deposit(int a) {
	        if (a < 0) {
	           
	        } else
	            balance = balance + a;
	    }
	    
	    public void withdraw() {
	         
	    }

	    public void getBalance() {
	         
	    }

	}

