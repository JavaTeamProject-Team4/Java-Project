// 2022111982
// 김경무
package PreviousExam.Midterm_2024.Class006.midexam2;

import java.util.Scanner;

public class IntArrayUtilApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntArrayUtil intArrayUtil = new IntArrayUtil();
        int[] a = new int[10];
        int[] b = new int[10];

        System.out.println("1. fill(a)");
        intArrayUtil.fill(a);

        System.out.println("2. fill(b)");
        intArrayUtil.fill(b);

        System.out.println("3. c=concat(a, b)");
        int[] c = new int[20];
        c = intArrayUtil.concat(a, b);

        System.out.println("4. compare(a, b)");
        int flag = intArrayUtil.compare(a, b);
        String temp = "";
        if (flag == 0) temp = "=";
        else if (flag == -1) temp = "<";
        else temp = ">";
        System.out.printf("\na %s b\n\n", temp);


        int start = 0, end = 0;
        while (true){
            System.out.println("5. d=slicing(a, start, end)");
            System.out.print("array(a)=");
            intArrayUtil.print(a);
            System.out.print("Type a start and an end index of array a: ");
            start = sc.nextInt();
            end = sc.nextInt();
            if (start >= end || start < 0 || end > a.length) System.out.println("Array index is wrong! Type Again");
            else break;
        }
        intArrayUtil.print(intArrayUtil.slice(a, start, end));

        System.out.println("Exit Program!");
        sc.close();
    }
}
