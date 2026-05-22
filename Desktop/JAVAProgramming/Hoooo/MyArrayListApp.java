package PreviousExam.Midterm_2021.Midexam1;

import java.util.Scanner;

public class MyArrayListApp {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        Scanner scanner = new Scanner(System.in);

        String msg = "Well begun is half done.";
        System.out.println("1. 원본 문자열: " + msg);

        System.out.println("2. 문자열을 공백 기준으로 분리 및 ArrayList에 추가");
        myArrayList.splitString(msg);
        System.out.println(myArrayList);

        System.out.print("3. 문자열 변경(2개 문자열 입력 [old] [new]): ");
        String oldStr = scanner.next();
        String newStr = scanner.next();

        myArrayList.replace(oldStr, newStr);
        System.out.println(myArrayList);

        scanner.close();
    }
}