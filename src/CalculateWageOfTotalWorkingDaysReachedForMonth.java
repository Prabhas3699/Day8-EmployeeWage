
public class CalculateWageOfTotalWorkingDaysReachedForMonth {

	public static void main(String[] args) {
		
		/*
		 * initialize variables
		 */
		int Full_Day_Hour = 1;
		int Part_Time_Hour = 2;
		int Emp_Day_Hour = 0;
		int Wage_Per_Hour = 20;
		int totalDays=20;
		
		for(int day = 1;day<=20; day++){
			
			/*
			 * using random function to generate random numbers
			 */
		double empCheck = Math.floor(Math.random()*10)%3;
		
		if(empCheck == Full_Day_Hour){
			Emp_Day_Hour = 8;
			//System.out.println("Employee is Present");
			
		}else if(empCheck == Part_Time_Hour) {
			Emp_Day_Hour = 4;
			//System.out.println("Employee is Part Time");
			
		}else {
			Emp_Day_Hour = 0;
			//System.out.println("Employee is Absent");
		
		}
		}System.out.println("Employe Wages For  Month ="+(Emp_Day_Hour*Wage_Per_Hour)*totalDays);

		

	}

}
