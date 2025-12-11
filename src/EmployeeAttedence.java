import java.util.Random;
public class EmployeeAttedence {

    public static final int IS_ABSENT=0;
    public static final int FULL_TIME=1;
    public static final int PART_TIME=2;


    public static void isEmployeeStatus(){
        EmployeeWages empWages = new EmployeeWages();

        Random random =new Random();
        int empStatus=random.nextInt(3);

        switch (empStatus) {
            case IS_ABSENT:
                System.out.println("Employee is Absent");
                break;

            case FULL_TIME:
                System.out.println("Full Time Wages: " + empWages.full_time_wages());
                break;

            case PART_TIME:
                System.out.println("Part Time Wages: " + empWages.part_time_wages());
                break;
        }
    }


}
