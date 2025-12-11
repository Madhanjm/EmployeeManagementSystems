import java.util.*;
public class EmployeeWages {
   public static final int wage_Per_Hour=20;
    public static final int full_day_hours=8;
    public static final int  part_Time_Hour=5;



    public static int full_time_wages(){
        return wage_Per_Hour*full_day_hours;
    }

    public static int part_time_wages(){
        return wage_Per_Hour*part_Time_Hour;
    }

}
