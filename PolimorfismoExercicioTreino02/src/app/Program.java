package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioCLT;
import entities.FuncionarioPJ;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("FUNCIONÁRIOS");
		System.out.print("Quantos funcionários? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			System.out.print("Tipo do funcionário CLT/PJ (c/p)");
			char resp = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			System.out.println("Tempo de empresa: ");
			int tempo = sc.nextInt();
			
			if(resp == 'c') {
				list.add(new FuncionarioCLT(nome, salario, tempo));
			}
			else {
				list.add(new FuncionarioPJ(nome, salario, tempo));
			}
		
			
		}
		
		for(Funcionario x : list) {
			System.out.println(x.getName() + " $:" + String.format("%.2f", x.calcularSalario()));
		}	
		
		sc.close();

	}

}
