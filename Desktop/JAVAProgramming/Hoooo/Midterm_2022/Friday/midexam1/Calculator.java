package PreviousExam.Midterm_2022.Friday.midexam1;

import java.util.Scanner;
import java.util.InputMismatchException;

class Calc {
    protected int a, b;
    public Calc() { a = b = 0; }
    public void setValue(int a, int b) { this.a = a; this.b = b; }
    public int calculate(int a, int b) { return 0; }
}

// 2. 덧셈
class Add extends Calc {
    @Override
    public int calculate(int a, int b) { return a + b; }
    @Override
    public String toString() { return "Add: " + a + " + " + b + " = "; }
}

// 3. 뺄셈
class Sub extends Calc {
    @Override
    public int calculate(int a, int b) { return a - b; }
    @Override
    public String toString() { return "Sub: " + a + " - " + b + " = "; }
}

// 4. 곱셈
class Mul extends Calc {
    @Override
    public int calculate(int a, int b) { return a * b; }
    @Override
    public String toString() { return "Mul: " + a + " * " + b + " = "; }
}

// 5. 나눗셈
class Div extends Calc {
    @Override
    public int calculate(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }
    @Override
    public String toString() { return "Div: " + a + " / " + b + " = "; }
}

// 6. 메인 실행 클래스
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("두 정수와 연산자를 입력하세요(종료: -1 -1): ");
            int a = 0, b = 0;
            String op = "";

            try {
                a = scanner.nextInt();
                b = scanner.nextInt();

                // 종료 조건
                if (a == -1 && b == -1) {
                    System.out.println("종료합니다.");
                    break;
                }
                op = scanner.next();

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                scanner.nextLine(); // 버퍼 찌꺼기 비우기 (필수)
                continue;
            }

            Calc calc = null;

            switch (op) {
                case "+": calc = new Add(); break;
                case "-": calc = new Sub(); break;
                case "*": calc = new Mul(); break;
                case "/":
                    if (b == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        continue; // 예외 처리 후 루프 처음으로
                    }
                    calc = new Div();
                    break;
                default:
                    // 사칙연산 기호 외의 잘못된 연산자 처리
                    System.out.println("잘못된 연산자입니다. 다시 입력하세요.");
                    continue;
            }

            calc.setValue(a, b);
            int result = calc.calculate(a, b);

            // 다형성을 이용한 오버라이딩 toString() 호출 및 결과 출력
            System.out.println(calc.toString() + result);
        }
        scanner.close();
    }
}
