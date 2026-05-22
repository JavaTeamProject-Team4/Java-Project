package hw0304.again;

import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		Staff[] staffs = new Staff[3];
		staffs[0] = new Staff();
		staffs[1] = new Staff();
		staffs[2] = new Staff();
		
		staffs[0].setName("John", "Smith");
		staffs[0].setAge(25);
		staffs[0].setPosition("Newcomer");
		staffs[0].setSalary(300);
		
		staffs[1].setName("Marry", "Anne");
		staffs[1].setAge(45);
		staffs[1].setPosition("Executive");
		staffs[1].setSalary(600);
		
		staffs[2].setName("Sue", "Jones");
		staffs[2].setAge(38);
		staffs[2].setPosition("Office manager");
		staffs[2].setSalary(450);
		
		Engineer[] engineers = new Engineer[3];
		engineers[0] = new Engineer();
		engineers[1] = new Engineer();
		engineers[2] = new Engineer();
		
		engineers[0].setName("Bob", "Lewis");
		engineers[0].setAge(28);
		engineers[0].setPosition("Junior Engineer");
		engineers[0].setSalary(350);
		engineers[0].setOverWorkingDay(17);
		
		engineers[1].setName("Lisa", "Barnes");
		engineers[1].setAge(37);
		engineers[1].setPosition("Senior Engineer");
		engineers[1].setSalary(580);
		engineers[1].setOverWorkingDay(20);
		
		engineers[2].setName("Michael", "Kevin");
		engineers[2].setAge(46);
		engineers[2].setPosition("SW Manager");
		engineers[2].setSalary(650);
		engineers[2].setOverWorkingDay(20);
		
		
		Scanner scanner = new Scanner(System.in);
		
		int op = -1;
		
		
		while (op != 0) {
			System.out.println("==========================================");
			System.out.println("1. Display all employees' information (Staff, Engineer");
			System.out.println("2. Display all staff's information");
			System.out.println("3. Display all engineers' information");
			System.out.println("4. Display all employess' name, salary, annual salary");
			System.out.println("5. Display all employees' name, position");
			System.out.println("0. Quit");
			System.out.println("==========================================");
			System.out.print("-> ");
			
			op = scanner.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("[Staff]");
					System.out.printf("%20s %5s %20s %10s %10s\n", "Name", "Age", "Position", "Salary", "Annual Salary");
					System.out.println("----------------------------------------------------------------");
					
					staffs[0].printEmployee();
					staffs[1].printEmployee();
					staffs[2].printEmployee();
					
					System.out.println("[Engineer]");
					System.out.printf("%20s %5s %20s %10s %10s %10s\n", "Name", "Age", "Position", "Overworking Pay", "Salary", "Annual Salary");
					System.out.println("----------------------------------------------------------------");
					
					engineers[0].printEmployee();
					engineers[1].printEmployee();
					engineers[2].printEmployee();
					break;
					
				case 2:
					System.out.println("[Staff]");
					System.out.printf("%20s %5s %20s %10s %10s\n", "Name", "Age", "Position", "Salary", "Annual Salary");
					System.out.println("----------------------------------------------------------------");
					
					staffs[0].printEmployee();
					staffs[1].printEmployee();
					staffs[2].printEmployee();
					break;
					
				case 3:
					System.out.println("[Engineer]");
					System.out.printf("%20s %5s %20s %10s %10s %10s\n", "Name", "Age", "Position", "Overworking Pay", "Salary", "Annual Salary");
					System.out.println("----------------------------------------------------------------");
					
					engineers[0].printEmployee();
					engineers[1].printEmployee();
					engineers[2].printEmployee();
					break;
					
				case 4:
					System.out.println("[Staff]");
					System.out.printf("%20s %10s %10s\n", "Name", "Salary", "Annual Salary");
					System.out.println("------------------------------------------------------");
					System.out.printf("%20s %10s %10s\n", staffs[0].getName(), staffs[0].getSalary(), staffs[0].getAnnualSalary());
					System.out.printf("%20s %10s %10s\n", staffs[1].getName(), staffs[1].getSalary(), staffs[1].getAnnualSalary());
					System.out.printf("%20s %10s %10s\n", staffs[2].getName(), staffs[2].getSalary(), staffs[2].getAnnualSalary());
					
					System.out.println("[Engineer]");
					System.out.printf("%20s %10s %10s\n", "Name", "Salary", "Annual Salary");
					System.out.println("------------------------------------------------------");
					System.out.printf("%20s %10s %10s\n", engineers[0].getName(), engineers[0].getSalary(), engineers[0].getAnnualSalary());
					System.out.printf("%20s %10s %10s\n", engineers[1].getName(), engineers[1].getSalary(), engineers[1].getAnnualSalary());
					System.out.printf("%20s %10s %10s\n", engineers[2].getName(), engineers[2].getSalary(), engineers[2].getAnnualSalary());
					
					break;
					
				case 5:
					System.out.println("[Staff]");
					System.out.printf("%20s %20s\n", "Name", "Position");
					System.out.println("------------------------------------------");
					System.out.printf("%20s %20s\n", staffs[0].getName(), staffs[0].getPosition());
					System.out.printf("%20s %20s\n", staffs[1].getName(), staffs[1].getPosition());
					System.out.printf("%20s %20s\n", staffs[2].getName(), staffs[2].getPosition());
					
					System.out.println("[Engineer]");
					System.out.printf("%20s %20s\n", "Name", "Positoon");
					System.out.println("------------------------------------------");
					System.out.printf("%20s %20s\n", engineers[0].getName(), engineers[0].getPosition());
					System.out.printf("%20s %20s\n", engineers[1].getName(), engineers[1].getPosition());
					System.out.printf("%20s %20s\n", engineers[2].getName(), engineers[2].getPosition());
					
					break;
					
				case 0:
					System.out.println("Bye!");
					break;
					
				default:
					System.out.println("Wrong input. Try again!");					
					
			}
		}
	}

}
