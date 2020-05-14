public class EmpWage{
  public static final int IS_PART_TIME=1;
  public static final int IS_FULL_TIME=2;

  private final String company;
  private final int empRatePerHour;
  private final int numOfWorkingDays;
  private final int maxHoursPerMonth; 

public EmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
this.company= company;
this.empRatePerHour= empRatePerHour;
this.numOfWorkingDays= numOfWorkingDays;
this.maxHoursPerMonth= maxHoursPerMonth;
}
public void computeEmpWage() {
//Variables
int totalempHrs=0;
int totalWorkingDays=0;
int totalEmpHrs=0;
int totalEmpWage=0;
//Computation
while (totalEmpHrs <= maxHoursPerMonth &&
        totalWorkingDays < numOfWorkingDays) {
	int empHrs=0;
    totalWorkingDays++;
int empCheck = (int) Math.floor(Math.random() * 10) % 3;
switch (empCheck) {
case IS_PART_TIME:
        empHrs=4;
        break;
case IS_FULL_TIME:
        empHrs=8;
        break;
default:
        empHrs=0;
}

totalEmpHrs += empHrs;
System.out.println("Days#: " + totalWorkingDays + " Emp Hr: " +empHrs);
}
totalEmpWage = totalEmpHrs * empRatePerHour;
}
public String toString(){
int totalEmpWage=0;
return "totalEmpWage for Company: "+company+ " is: " + totalEmpWage;
}
public static void main(String[]args) {
EmpWage dMart = new EmpWage("DMart", 20,2,10);
EmpWage relaince= new EmpWage("Reliance" , 10,4,20);
dMart.computeEmpWage();
System.out.println(dMart);
relaince.computeEmpWage();
System.out.println(relaince);
}

}
