
public class Switchcase {
	 public static final int parttime = 1;
	    public static final int fulltime = 2;
	    public static final int wageperhour = 20;
	    public static void main(String[] args) {
	        int hours = 0;
	        int empwage = 0;
	        int empcheck = (int) Math.floor(Math.random()*10) % 3;
	        switch(empcheck) {
	            case parttime:
	                hours = 3;
	                break;
	            case fulltime:
	                hours = 6;
	                break;
	 default:
	                hours = 0;
	        }
	        empwage = hours * wageperhour;
	        System.out.println("Emp wage:" + empwage);
	    

	}
}
