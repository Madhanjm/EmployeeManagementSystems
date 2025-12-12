import java.util.ArrayList;
import java.util.Random;

public class EmpWageBuilder {

     public static final int IS_ABSENT=0;
    public static final int FULL_TIME=1;
    public static final int PART_TIME=2;

    //private ArrayList<CompanyEmpWage> companyList = new ArrayList<>();
    private CompanyEmpWage[] companyArray;
    private int companyCount;

    public EmpWageBuilder(int size){
        companyArray=new CompanyEmpWage[size];
    }


    public void addCompany(String companyName,int wagePerHour,int workingDays,int maxWorkingHours){
        companyArray[companyCount]=new CompanyEmpWage(companyName,wagePerHour,workingDays,maxWorkingHours);
        companyCount++;
    }

    public void computeWages(){
        for(int i=0;i<companyCount;i++){
            CompanyEmpWage company=companyArray[i];
            int totalWage=computeCompanyWages(company);
            company.setTotalWages(totalWage);
            System.out.println(company);
            System.out.println("------------------------------");
        }
    }

    public   int getDailyHours(){
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

    public  int computeCompanyWages(CompanyEmpWage company){

        int totalHours=0;
        int totaldays=0;
        int totalWages=0;

        while (totaldays<company.workingDays && totalHours<company.maxMonthlyHours){

            int dailyHours=getDailyHours();
            totalHours+=dailyHours;
            totaldays++;

            totalWages+=dailyHours*company.wagesPerHour;

            System.out.println(company.companyName+" - Day "+ totaldays+ "| Hours: "+dailyHours+ " | Wage: "+(dailyHours*company.wagesPerHour));

        }
        System.out.println("Total Montly Wages for "+company.companyName+" = "+totalWages);

        return totalWages;

    }
}


