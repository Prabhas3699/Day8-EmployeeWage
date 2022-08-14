
public class RefactorEmployeeWage{
		
	/*
	 * initialize variables
	 */
	public int Full_Day_Hour ;
	public int Part_Time_Hour;
	public int Emp_Day_Hour;
	public int Wage_Per_Hour ;
		/**
		 * constructor
		 * @param full_Day_Hour
		 * @param part_Time_Hour
		 * @param emp_Day_Hour
		 * @param wage_Per_Hour
		 */
		public RefactorEmployeeWage(int full_Day_Hour, int part_Time_Hour, int emp_Day_Hour, int wage_Per_Hour) {
			super();
			Full_Day_Hour = full_Day_Hour;
			Part_Time_Hour = part_Time_Hour;
			Emp_Day_Hour = emp_Day_Hour;
			Wage_Per_Hour = wage_Per_Hour;
		}
		
		/*
		 * getters 
		 */
		
		/**
		 * @return the full_Day_Hour
		 */
		public int getFull_Day_Hour() {
			return Full_Day_Hour*Wage_Per_Hour;
		}
		
		/**
		 * @return the part_Time_Hour
		 */
		public int getPart_Time_Hour() {
			return Part_Time_Hour*Wage_Per_Hour;
		}
		
		/**
		 * @return the emp_Day_Hour
		 */
		public int getEmp_Day_Hour() {
			return Emp_Day_Hour*Wage_Per_Hour;
		}
		
		
}
