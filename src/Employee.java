import java.util.Random;
public class Employee {

    public static final int IS_ABSENT=0;
    public static final int FULL_TIME=1;
    public static final int PART_TIME=2;
    public   String companyName;
    public  int wagesPerHour;
    public  int workingDays;
    public  int maxMonthlyHours;

    public  int totalWages;

    public Employee(String companyName, int wagesPerHour, int workingDays, int maxMonthlyHours) {
        this.companyName=companyName;
        this.wagesPerHour=wagesPerHour;
        this.workingDays=workingDays;
        this.maxMonthlyHours=maxMonthlyHours;
    }

    public  void setTotalWages(int totalWages) {
        this.totalWages = totalWages;
    }

    @Override
    public String toString(){
        return "Total Employee Wage for "+companyName+" = "+totalWages;
    }




    public static int getDailyHours(){
        int empStatus=new Random().nextInt(3);

        switch(empStatus){

            case PART_TIME:
                return 4;

            case FULL_TIME:
                return 8;

            default:
                return 0;


        }
    }

    public  int computeCompanyWages(Employee company){

        int totalHours=0;
        int totaldays=0;
         this.totalWages=0;

        while (totaldays<company.workingDays && totalHours<company.maxMonthlyHours){

            int dailyHours=getDailyHours();
            totalHours+=dailyHours;
            totaldays++;

            totalWages+=dailyHours*company.wagesPerHour;

            System.out.println(companyName+" - Day "+ totaldays+ "| Hours: "+dailyHours+ " | Wage: "+(dailyHours*wagesPerHour));

        }
        System.out.println("Total Montly Wages for "+companyName+" = "+totalWages);

        return totalWages;

    }



}
