package org.emp;

public class Employee {
	private void empInfo() {
		System.out.println("Employee Info is...");
	}
		
		private void empInfo( int age) {
			System.out.println("Employee Age ...:"+age);
			}
		private void empInfo( String name) {
			System.out.println("Employee Name  ...:"+name);
			
			}
		private void empInfo(String Name,int PhoneNumber) {
			System.out.println("Employee name is ...:"+ "name");
			System.out.println("Employee Phone Number is:"+PhoneNumber);
			}
		private void empInfo(int PhoneNumber, String Name) {
			
			System.out.println("Employee Phone Number is:"+PhoneNumber);
			System.out.println("Employee name is ...:"+"name");
		}
		public static void main(String[] args) {
			Employee E=new Employee();
			E.empInfo();
			E.empInfo(30);
			E.empInfo("Sri");
			E.empInfo("Selva,8838340950l");
			E.empInfo("9894259931l, Varshu");
			
		}

}
