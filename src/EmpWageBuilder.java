import java.util.ArrayList;

public class EmpWageBuilder {

    private ArrayList<Employee> companyList = new ArrayList<>();

    public void addCompany(String companyName,int wagePerHour,int workingDays,int maxWorkingHours){
        Employee company=new Employee(companyName,wagePerHour,workingDays,maxWorkingHours);
        companyList.add(company);
    }

    public void computeWages(){
        for(Employee company : companyList){
            company.setTotalWages(company.computeCompanyWages(company));
            System.out.println(company);
        }
    }
}
