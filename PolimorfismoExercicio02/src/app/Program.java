package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i <=n; i++) {
			System.out.println("Shape #" + i + " data");
			System.out.print("Rectangle or Circle (r/c)? ");
			char resp = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Color (BLACK, BLUE, RED: ") ;
			Color color = Color.valueOf(sc.nextLine().toUpperCase());
			
			if(resp == 'r') {
				System.out.print("Width: ");
				double w = sc.nextDouble();
				System.out.print("hight: ");
				double h = sc.nextDouble();
				Rectangle rectangle = new Rectangle(color, w,h);
				
				list.add(rectangle);
			}
			
			if(resp == 'c') {
				System.out.print("Radius: ");
				double r = sc.nextDouble();
				Circle circle = new Circle(color, r);
				list.add(circle);
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for(Shape s : list) {
			System.out.printf("%.2f%n",s.area());
		}		
		
		
		
		sc.close();

	}

}
