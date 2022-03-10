
public class Parttime {
	public static void main(String[] args) {
        int parttime = 1;
        int fulltime = 2;
        int wageperhour = 20;
        int hours = 0;
        int empwage = 0;
        double empcheck = Math.floor(Math.random()*10) % 3;
        if(empcheck == parttime)
            hours = 4;
        else if(empcheck == fulltime)
            hours = 8;
        else
            hours = 0;
        empwage = hours * wageperhour;
        System.out.println("Emp wage:" + empwage);
}
}
