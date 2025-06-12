package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;



public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();

		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsouced (y/n)? ");
			
			char resp = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Velue per hour: ");
			double valuePerHour = sc.nextDouble();
			
			
			if(resp == 'y') {				
				
				System.out.print("Addition charge: ");
				double additionCharge = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionCharge));				
			}
			
			if(resp == 'n') {
				list.add(new Employee(name,hours, valuePerHour));				
			}
			
		}
		
		System.out.println("PAYMENTS:");
		for(Employee x : list) {
			System.out.println(x);
		}
		
		
		sc.close();

	}

}
