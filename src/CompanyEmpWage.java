import java.util.Random;
public class CompanyEmpWage {


    public   String companyName;
    public  int wagesPerHour;
    public  int workingDays;
    public  int maxMonthlyHours;

    public  int totalWages;

    public CompanyEmpWage(String companyName, int wagesPerHour, int workingDays, int maxMonthlyHours) {
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







}
