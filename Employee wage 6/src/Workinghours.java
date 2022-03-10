
public class Workinghours {
	public static final int parttime = 1;
    public static final int fulltime = 2;
    public static final int wageperhour = 500;
    public static final int workingdays = 20;
    public static final int hoursinmonth = 100;
    public static void main(String[] args) {
        int hours = 0;
        int totalemphrs = 0;
        int totalworkingdays = 0;
        while(totalemphrs<=hoursinmonth && totalworkingdays<workingdays) {
            totalworkingdays++;
    
int empcheck = (int) Math.floor(Math.random()*10) % 3;
            switch(empcheck) {
                case parttime:
                    hours = 6;
                    break;
                case fulltime:
                    hours = 12;
                    break;
                default:
                    hours = 0;
            }
            totalemphrs+=hours;
            System.out.println("Day: " +totalworkingdays +"emp hr: " +hours);
        }
int totalempwage = totalemphrs * wageperhour;
        System.out.println("Total emp wage:" + totalempwage);


    }

}


