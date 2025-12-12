import java.util.ArrayList;
import java.util.Random;
public class CompanyEmpWage {


    public   String companyName;
    public  int wagesPerHour;
    public  int workingDays;
    public  int maxMonthlyHours;


    public  int totalWages;

    public ArrayList<Integer> dailyWageList;

    public CompanyEmpWage(String companyName, int wagesPerHour, int workingDays, int maxMonthlyHours) {
        this.companyName=companyName;
        this.wagesPerHour=wagesPerHour;
        this.workingDays=workingDays;
        this.maxMonthlyHours=maxMonthlyHours;

        dailyWageList= new ArrayList<>();
    }

    public void addDailyWage(int dailyWage){
        dailyWageList.add(dailyWage);
    }

    public  void setTotalWages(int totalWages) {
        this.totalWages = totalWages;
    }

    @Override
    public String toString(){
        return "\nCompany: "+companyName+
                "\nDailyWage: "+dailyWageList+
                "\nTotal Monthly wage = "+totalWages;
    }







}
