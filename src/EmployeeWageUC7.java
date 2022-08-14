
public class EmployeeWageUC7 {

	public static void main(String[] args) {
		
		RefactorEmployeeWage employeeWage = new RefactorEmployeeWage(8,4,0,20);
		
		/*
		 * using random function to generate random numbers
		 */
		double empCheck = Math.floor(Math.random() * 10) % 3;
		 
         if (empCheck == 1) {
             System.out.println("The Employee is Full Time :"+employeeWage.getFull_Day_Hour());
         } else if (empCheck == 2) {
             System.out.println("The Employee is Part Time :"+employeeWage.getPart_Time_Hour());
         } else {
             System.out.println("The Employee is Absent :"+employeeWage.getEmp_Day_Hour());
         }
	}

}
