package jokbo24.slicing;

//학번 : 2025005685
//이름 : 유다경

import java.util.Scanner;

public class StringUtilApp {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     StringUtil util = new StringUtil();

     String text =
             "Java was originally developed by James Gosling at Sun Microsystems."
           + "It was released in May 1995 as a core component of Sun's Java platform."
           + "Sun had relicensed most of its Java technologies under the GPL-2.0-only license.";

     while (true) {
         System.out.println("----------------------------------------");
         System.out.println("1. Search a word");
         System.out.println("2. Replace a word");
         System.out.println("3. Slice a String");
         System.out.println("0. Quit");
         System.out.println("----------------------------------------");
         System.out.print("Choose a number: ");

         int menu = scanner.nextInt();
         scanner.nextLine();

         if (menu == 1) {
             System.out.print("Type a search word: ");
             String searchWord = scanner.nextLine();

             int count = util.getWordCount(text, searchWord);
             System.out.println();
             System.out.println(searchWord + " found: " + count + " times");
         }
         else if (menu == 2) {
             System.out.print("Type two words(seachword replacement): ");
             String line = scanner.nextLine();

             int blankIndex = line.indexOf(" ");
             String searchWord = line.substring(0, blankIndex);
             String replacement = line.substring(blankIndex + 1);

             String replaced = util.replaceWord(text, searchWord, replacement);

             if (!replaced.equals("")) {
                 System.out.println(replaced);
                 text = replaced;
             }
         }
         else if (menu == 3) {
             int start, end;

             while (true) {
                 System.out.print("Type a range(start ~ end): ");
                 start = scanner.nextInt();
                 end = scanner.nextInt();

                 System.out.println("start: " + start + ", end: " + end + ", len: " + text.length());

                 if (start < 0 || end < 0 || start >= end || start > text.length() || end > text.length()) {
                     System.out.println("Index is out of range!");
                 } else {
                     break;
                 }
             }

             String sliced = util.sliceString(text, start, end);
             System.out.println("Sliced String: " + sliced);
             scanner.nextLine();
         }
         else if (menu == 0) {
             System.out.println("Quit Program");
             break;
         }
     }

     scanner.close();
 }
}