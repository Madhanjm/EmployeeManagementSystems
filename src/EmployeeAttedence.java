import java.util.Random;
public class EmployeeAttedence {
    public static final int IS_PRESENT=1;

    public static void isEmployeePresent(){
        Random random =new Random();
        int checkEmp=random.nextInt(2);

        if(checkEmp==IS_PRESENT){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is Absent");
        }
    }
}
