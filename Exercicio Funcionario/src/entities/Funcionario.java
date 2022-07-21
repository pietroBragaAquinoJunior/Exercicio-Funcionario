package entities;

public class Funcionario {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		grossSalary *= 100;
		grossSalary /= percentage;
	}
	
	public String toString() {
		return name+", $ "+NetSalary();
	}
	
}
