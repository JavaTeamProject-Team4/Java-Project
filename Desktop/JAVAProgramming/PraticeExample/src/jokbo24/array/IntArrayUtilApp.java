package jokbo24.array;

//학번 : 2025005685
//이름 : 유다경

import java.util.Scanner;

public class IntArrayUtilApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     IntArrayUtil util = new IntArrayUtil();

     int[] a = new int[10];
     int[] b = new int[10];

     System.out.println("1. fill(a)");
     util.fill(a);
     util.print(a);
     System.out.println();

     System.out.println("2. fill(b)");
     util.fill(b);
     util.print(b);
     System.out.println();

     System.out.println("3. c=concat(a, b)");
     int[] c = util.concat(a, b);
     util.print(c);
     System.out.println();

     System.out.println("4. compare(a, b)");
     int compareResult = util.compare(a, b);
     if (compareResult == 1) {
         System.out.println("a > b");
     } else if (compareResult == 0) {
         System.out.println("a = b");
     } else {
         System.out.println("a < b");
     }
     System.out.println();

     int start, end;
     while (true) {
         System.out.println("5. d=slicing(a, start, end)");
         System.out.print("array(a)= ");
         util.print(a);
         System.out.println();

         System.out.print("Type a start and an end index of array a: ");
         start = scanner.nextInt();
         end = scanner.nextInt();

         if (start < end && start >= 0 && end <= a.length) {
             break;
         }

         System.out.println("Array index is wrong! Type Again");
     }

     int[] d = util.slice(a, start, end);
     util.print(d);
     System.out.println();

     System.out.println("Exit Program!");
     scanner.close();
 }
}