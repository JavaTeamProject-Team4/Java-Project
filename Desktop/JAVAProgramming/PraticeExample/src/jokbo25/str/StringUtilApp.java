package jokbo25.str;

//학번 : 2025005685
//이름 : 유다경

import java.util.Scanner;

public class StringUtilApp {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     StringUtil util = new StringUtil();

     while (true) {
         System.out.println("----------------------------------------");
         System.out.println("1. Search a word and display all indexes");
         System.out.println("2. Replace a word one by one");
         System.out.println("0. Quit");
         System.out.println("----------------------------------------");
         System.out.print("Choose a number: ");

         int menu = scanner.nextInt();
         scanner.nextLine();

         if (menu == 1) {
             System.out.print("Type a search word: ");
             String word = scanner.nextLine();
             util.searchWord(word);
         } else if (menu == 2) {
             System.out.print("Type two words(searchword, replacement): ");
             String line = scanner.nextLine();

             int blank = line.indexOf(" ");
             if (blank == -1) {
                 System.out.println("Wrong input. Type again!");
                 continue;
             }

             String target = line.substring(0, blank);
             String replacement = line.substring(blank + 1);

             util.replaceWord(target, replacement);
         } else if (menu == 0) {
             System.out.println("Quit Program");
             break;
         } else {
             System.out.println("Wrong Menu. Type again!");
         }
     }

     scanner.close();
 }
}