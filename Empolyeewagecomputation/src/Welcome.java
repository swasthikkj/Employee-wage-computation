
public class Welcome {

	public static void main(String[] args){
        int employee = 1;
        double empCheck = Math.floor(Math.random() * 10) % 4;
        if (empCheck == employee)
             System.out.println("Employee is Present");
        else
             System.out.println("Employee is Absent");
     }
}