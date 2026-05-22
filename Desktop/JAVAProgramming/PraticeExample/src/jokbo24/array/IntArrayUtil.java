package jokbo24.array;

//학번 : 2025005685
//이름 : 유다경

import java.util.Random;

public class IntArrayUtil {
 public void fill(int[] a) {
     Random random = new Random();

     for (int i = 0; i < a.length; i++) {
         a[i] = random.nextInt(99) + 1;
     }
 }

 public int[] concat(int[] a, int[] b) {
     int[] result = new int[a.length + b.length];

     for (int i = 0; i < a.length; i++) {
         result[i] = a[i];
     }

     for (int i = 0; i < b.length; i++) {
         result[a.length + i] = b[i];
     }

     return result;
 }

 public int compare(int[] a, int[] b) {
     int maxA = a[0];
     int maxB = b[0];

     for (int i = 1; i < a.length; i++) {
         if (a[i] > maxA) {
             maxA = a[i];
         }
     }

     for (int i = 1; i < b.length; i++) {
         if (b[i] > maxB) {
             maxB = b[i];
         }
     }

     System.out.println("a의 최대값: " + maxA + ", b의 최대값: " + maxB);

     if (maxA > maxB) {
         return 1;
     } else if (maxA == maxB) {
         return 0;
     } else {
         return -1;
     }
 }

 public int[] slice(int[] a, int start, int end) {
     int[] result = new int[end - start];

     for (int i = start; i < end; i++) {
         result[i - start] = a[i];
     }

     return result;
 }

 public void print(int[] a) {
     System.out.print("[");
     for (int i = 0; i < a.length; i++) {
         System.out.print(a[i]);
         if (i != a.length - 1) {
             System.out.print(", ");
         }
     }
     System.out.println("]");
 }
}