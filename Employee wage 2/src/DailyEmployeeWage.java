
public class DailyEmployeeWage {
	public static void main(String[] args){
       int time = 1;
       int wageperhour = 20;
       int emphours = 0;
       int empwage = 0;
       double empcheck = Math.floor(Math.random()*10) % 2;
       if(empcheck == time)
           emphours = 8;
       else
           emphours = 0;
       empwage = emphours * wageperhour;
       System.out.println("Emp wage:" + empwage);
   }
}

