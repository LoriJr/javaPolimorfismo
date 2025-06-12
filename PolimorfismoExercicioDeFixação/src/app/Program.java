package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");			
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				double cf = sc.nextDouble();
				
				Product product = new ImportedProduct(name, price, cf);
				list.add(product);
			}
			if(ch=='c') {
				Product product = new Product(name, price);
				list.add(product);
			}
			if(ch=='u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date dt = sdt.parse(sc.next());
				
				Product product = new UsedProduct(name, price, dt);
				list.add(product);
			}
		}
		
		for(Product x: list) {
			System.out.println(x.priceTag());
		}
		
		
		sc.close();
		

	}

}
