//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            System.out.println("Welcome to Employee Mangement System");
            EmpWageBuilder empBuilder = new EmpWageBuilder();
        empBuilder.addCompany("TCS",20,20,100);
        empBuilder.addCompany("Wipro",20,21,120);
        empBuilder.computeWages();

        System.out.println("\nQuired Wage:"+
                empBuilder.getTotalWageByCompany("TCS"));
    }
    }
