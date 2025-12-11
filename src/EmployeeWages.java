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

    public static int monthlyWages(){
        int totalWage=0;
        for(int day=1;day<=20;day++){

            int empStatus=new Random().nextInt(3);
            switch (empStatus){
                case EmployeeAttedence.FULL_TIME :
                    totalWage+=full_time_wages();
                    break;
                case EmployeeAttedence.PART_TIME:
                    totalWage+=part_time_wages();
                    break;
                case EmployeeAttedence.IS_ABSENT:
                    totalWage+=0;
                    break;
            }
        }
        return totalWage;
    }

    public static int calculateWagesTillCondition(){
        int totalHours=0;
        int totalDays=0;
        int totalWages=0;

        Random random=new Random();

        while(totalHours<100 && totalDays<20){

            int empStatus= random.nextInt(3);
            int dailyHours=0;

            switch (empStatus){
                case EmployeeAttedence.FULL_TIME :
                    dailyHours=full_day_hours;
                    break;
                case EmployeeAttedence.PART_TIME:
                    dailyHours=part_Time_Hour;
                    break;
                case EmployeeAttedence.IS_ABSENT:
                    dailyHours=0;
                    break;
            }
            totalHours+=dailyHours;
            totalDays++;

            totalWages+=dailyHours*wage_Per_Hour;
        }
        return totalWages;


    }



}
