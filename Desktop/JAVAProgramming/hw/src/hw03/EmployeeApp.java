// 학번 : 2025005685
// 이름 : 유다경

package hw03;

import java.util.Scanner;

public class EmployeeApp {
    public static final int MAXNUM = 3;

    public static void inputStaffInfo(Staff[] staffs) {
        for (int i = 0; i < MAXNUM; i++) {
            staffs[i] = new Staff();
        }

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
        staffs[2].setPosition("Office Manager");
        staffs[2].setSalary(450);
    }

    public static void inputEngineerInfo(Engineer[] engineers) {
        for (int i = 0; i < MAXNUM; i++) {
            engineers[i] = new Engineer();
        }

        engineers[0].setName("Bob", "Lewis");
        engineers[0].setAge(28);
        engineers[0].setPosition("Junior Engineer");
        engineers[0].setSalary(350);
        engineers[0].setOverworkingDay(17);

        engineers[1].setName("Lisa", "Barnes");
        engineers[1].setAge(37);
        engineers[1].setPosition("Senior Engineer");
        engineers[1].setSalary(580);
        engineers[1].setOverworkingDay(20);

        engineers[2].setName("Michael", "Kevin");
        engineers[2].setAge(46);
        engineers[2].setPosition("SW Manager");
        engineers[2].setSalary(650);
        engineers[2].setOverworkingDay(20);
    }

    public static void displayEmployeeInfo(Staff[] staffs, Engineer[] engineers) {
        System.out.println("[Staff]");
        System.out.printf("%20s %5s %20s %10s %15s\n",
                "Name", "Age", "Position", "Salary", "Annual Salary");
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < staffs.length; i++) {
            staffs[i].printEmployee();
        }

        System.out.println("[Engineer]");
        System.out.printf("%20s %5s %20s %16s %10s %10s%n",
                "Name", "Age", "Position", "Overworking Pay", "Salary", "Annual Salary");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (int i = 0; i < engineers.length; i++) {
            engineers[i].printEmployee();
        }
    }

    public static void displayStaffInfo(Staff[] staffs) {
        System.out.println("[Staff]");
        System.out.printf("%20s %5s %20s %10s %15s\n",
                "Name", "Age", "Position", "Salary", "Annual Salary");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < staffs.length; i++) {
            staffs[i].printEmployee();
        }
    }

    public static void displayEngineerInfo(Engineer[] engineers) {
        System.out.println("[Engineer]");
        System.out.printf("%20s %5s %20s %15s %10s %10s%n",
                "Name", "Age", "Position", "Overworking Pay", "Salary", "Annual Salary");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (int i = 0; i < engineers.length; i++) {
            engineers[i].printEmployee();
        }
    }

    public static void displayNameSalary(Staff[] staffs, Engineer[] engineers) {
        System.out.println("[Staff]");
        System.out.printf("%20s %10s %15s%n", "Name", "Salary", "Annual Salary");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < staffs.length; i++) {
            System.out.printf("%20s %10d %15d%n",
                    staffs[i].getName(), staffs[i].getSalary(), staffs[i].getAnnualSalary());
        }

        System.out.println("[Engineer]");
        System.out.printf("%20s %10s %15s%n", "Name", "Salary", "Annual Salary");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < engineers.length; i++) {
            System.out.printf("%20s %10d %15d%n",
                    engineers[i].getName(), engineers[i].getSalary(), engineers[i].getAnnualSalary());
        }
    }

    public static void displayNamePosition(Staff[] staffs, Engineer[] engineers) {
        System.out.println("[Staff]");
        System.out.printf("%20s %20s%n", "Name", "Position");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < staffs.length; i++) {
            System.out.printf("%20s %20s%n",
                    staffs[i].getName(), staffs[i].getPosition());
        }
        System.out.println("");
        System.out.println("[Engineer]");
        System.out.printf("%20s %20s%n", "Name", "Position");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < engineers.length; i++) {
            System.out.printf("%20s %20s%n", engineers[i].getName(), engineers[i].getPosition());
        }
    }

    public static void printMenu() {
        System.out.println("========================================================");
        System.out.println("1. Display all employees' information (Staff, Engineer)");
        System.out.println("2. Display all staffs' information");
        System.out.println("3. Display all engineers' information");
        System.out.println("4. Display all employees' name, salary, annual salary");
        System.out.println("5. Display all employees' name, position");
        System.out.println("0. Quit");
        System.out.println("========================================================");
        System.out.print("-> ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Staff[] staffs = new Staff[MAXNUM];
        Engineer[] engineers = new Engineer[MAXNUM];

        inputStaffInfo(staffs);
        inputEngineerInfo(engineers);

        while (true) {
            printMenu();
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    displayEmployeeInfo(staffs, engineers);
                    break;
                case 2:
                    displayStaffInfo(staffs);
                    break;
                case 3:
                    displayEngineerInfo(engineers);
                    break;
                case 4:
                    displayNameSalary(staffs, engineers);
                    break;
                case 5:
                    displayNamePosition(staffs, engineers);
                    break;
                case 0:
                    System.out.println("Bye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Wrong input. Try again!");
            }
        }
    }
}