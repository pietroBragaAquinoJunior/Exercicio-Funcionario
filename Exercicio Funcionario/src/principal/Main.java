package principal;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Name: ");
		func.name = sc.next();
		
		System.out.print("Gross Salary: ");
		func.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		func.tax = sc.nextDouble();
		
		System.out.println("Employee: "+ func);
		
		System.out.print("Which percentage to increase salary?");
		func.IncreaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: "+func);
		
	}

}
