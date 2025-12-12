import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class EmpWageBuilder implements InterfaceEmployeeWage{

     public static final int IS_ABSENT=0;
    public static final int FULL_TIME=1;
    public static final int PART_TIME=2;

    //private ArrayList<CompanyEmpWage> companyList = new ArrayList<>();
    private ArrayList<CompanyEmpWage> companyList;
    private HashMap<String,CompanyEmpWage> companyMap=new HashMap<>();


    public EmpWageBuilder( ){
        companyList=new ArrayList<>();
    }

    @Override
    public void addCompany(String companyName,int wagePerHour,int workingDays,int maxWorkingHours){
        CompanyEmpWage company =new CompanyEmpWage(companyName,wagePerHour,workingDays,maxWorkingHours);
        companyList.add(company);
        companyMap.put(companyName,company);
    }

    @Override
    public void computeWages(){
        for(CompanyEmpWage company  : companyList){
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
            int dailyWage=dailyHours*company.wagesPerHour;

            totalWages+=dailyHours*company.wagesPerHour;

            company.addDailyWage(dailyWage);

            System.out.println(company.companyName+" - Day "+ totaldays+ "| Hours: "+dailyHours+ " | Wage: "+dailyWage);

        }
        System.out.println("Total Montly Wages for "+company.companyName+" = "+totalWages);

        return totalWages;

    }


    public int getTotalWageByCompany(String companyName){
        if(companyMap.containsKey(companyName)){
            return companyMap.get(companyName).totalWages;
        }else{
            System.out.println("Company not found");
            return -1;
        }
    }

}


