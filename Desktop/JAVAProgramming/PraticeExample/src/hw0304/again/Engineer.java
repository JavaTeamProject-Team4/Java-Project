package hw0304.again;

public class Engineer extends Employee {

    private int overworkingDay;

    // 초과 근무 일수 저장
    public void setOverWorkingDay(int day) {
        this.overworkingDay = day;
    }

    // 초과 근무 비용
    public int getOverworkingPay() {
        return overworkingDay * 3;
    }

    // 연봉 계산
    public int getAnnualSalary() {
        return (getSalary() + getOverworkingPay()) * 12;
    }

    // 오버라이딩
    @Override
    public void printEmployee() {
        System.out.printf("%20s %5d %20s %10d %10d %10d\n",
                getName(),
                getAge(),
                getPosition(),
                getOverworkingPay(),
                getSalary(),
                getAnnualSalary());
    }
}