package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter de number of tax payer: ");
		int n = sc.nextInt();
		double sum=0.0;
		
		for(int i = 1; i <= n; i ++) {
			System.out.println("Tax payer #" + i + " data: ");
			
			System.out.print("Invidual or Company (i/c) ? ");
			char resp = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine().toUpperCase();
			System.out.print("Anual Income: ");
			double income = sc.nextDouble();
			
			
			
			if(resp == 'i') {
				System.out.print("Health Expenditures: ");
				double he = sc.nextDouble();
				list.add(new Individual(name, income, he));	
				
			}
			if(resp == 'c') {
				System.out.print("Number of employees: ");
				int empNumber = sc.nextInt();
				list.add(new Company(name, income, empNumber));
				
				
			}
			
		}
		
		
		
		System.out.println("TAXES PAID:");
		for(TaxPayer x : list) {
			double tax = x.tax();
			System.out.println(x.getName()+ " $: " + String.format("%.2f", x.tax()));
			sum += tax;
		}	
		
		System.out.println("Total: $ " + String.format("%.2f", sum) );
		
		sc.close();

	}

}
