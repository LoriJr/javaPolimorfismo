package app;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		System.out.println(acc);////////////////////////////////////////////////////////
		
		Account acc1 = bacc;////////////////////////////////////////////////////////////
		System.out.println(acc1);
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2; //necessário fazer um casting antes da varíavel, (BusinessAccount)acc2
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3; essa operação não é permitida pq a cc3 foi instanciada do tipo SavingsAccount e ela é uma Account, e não uma BusinessAccount

		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");			
		}
		if(acc3 instanceof SavingsAccount) {
			System.out.println("Update!");
		}
		
		// SOBREPOSIÇÃO
		
		//primeiro exemplo de saque de conta comum 
		Account acc6 = new Account(1005, "Alex", 1000.0);
		acc6.withDraw(200.0);
		System.out.println(acc6.getBalance());
		
		//segundo exemplo de saque de conta poupança usando o @Override
		Account acc7 = new SavingsAccount(1006, "Maria", 1000.0, 0.01); // fazendo upcasting de SavingsAccount para Account
		acc7.withDraw(200.0);
		System.out.println(acc7.getBalance());
		
		
		//SUPER
		//exemplo de utilização da palavra super
		//o override está na classe BusinessAccount
		Account acc8 = new BusinessAccount(1007, "Alex", 1000.0, 500.0);
		acc8.withDraw(200.0);
		System.out.println(acc8.getBalance());
		
		
	}

}
