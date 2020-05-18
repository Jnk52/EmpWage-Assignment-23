package empwage;

import java.util.HashMap;
import java.util.Map;

public class EmpWageBuilderUC12 {
public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHr;
    private final int numOfWorkDays;
    private final int maxHrsPerMonth;
    private int totalEmpWage;
    private Map<String, Integer> dailyWage;

    public EmpWageBuilderUC12(String company, int empRatePerHr, int numOfWorkDays, int maxHrsPerMonth){
        this.company = company;
        this.empRatePerHr = empRatePerHr;
        this.numOfWorkDays = numOfWorkDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
        dailyWage = new HashMap<>();
    }

    public void totalEmpWage() {
        //VARIABLES
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        //COMPUTATION
        while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days: " + totalWorkingDays + " Emp Hours: " + empHrs);
            dailyWage.put("Emp Wage for Day"+totalWorkingDays+": ",(empRatePerHr*empHrs));
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
       
    }
    @Override
    public String toString(){
        return "Total employee wage for company "+company+" is "+totalEmpWage;
    }

    public static void main(String args[]) {
        EmpWageBuilderUC12 dMart = new EmpWageBuilderUC12("DMart", 20, 2, 10);
        dMart.totalEmpWage();
        System.out.println(dMart);
        System.out.println(dMart.dailyWage);
}

}
