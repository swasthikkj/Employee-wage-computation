
public class Month {
	public static final int parttime = 1;
    public static final int fulltime = 2;
    public static final int wageperhour = 500;
    public static final int workingdays = 20;
    public static void main(String[] args) {
        int hours = 0;
        int empwage = 0;
        int totalempwage = 0;
        for(int day=0; day<workingdays; day++) {
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
            empwage = hours * wageperhour;
            totalempwage+=empwage;
            System.out.println("Emp wage:" + empwage);
        }
        System.out.println("Total emp wage:" + totalempwage);
    }
}

