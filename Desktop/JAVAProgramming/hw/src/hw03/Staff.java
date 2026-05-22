// 학번 : 2025005685
// 이름 : 유다경 

package hw03;

public class Staff extends Employee {

    public int getAnnualSalary() {
        return getSalary() * 12;
    }

    @Override
    public void printEmployee() {
        System.out.printf("%20s %5d %20s %10d %15d%n",
                getName(), getAge(), getPosition(), getSalary(), getAnnualSalary());
    }
}
