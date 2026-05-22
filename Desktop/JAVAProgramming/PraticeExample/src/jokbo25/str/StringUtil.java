package jokbo25.str;

//학번 : 2025005685
//이름 : 유다경

public class StringUtil {
 private String text =
         "Betty Botter bought some butter, but she said this butter’s bitter. "
         + "If I put it in my batter, it will make my batter bitter.\n"
         + "So, she bought some better butter, better than the bitter butter,"
         + " and she put it in her batter, and her batter was not bitter.\n";

 public void searchWord(String word) {
     int index = 0;
     int found = 0;

     System.out.print("index: [");
     while (true) {
         index = text.indexOf(word, index);

         if (index == -1) {
             break;
         }

         System.out.print(index + ", ");
         found++;
         index += word.length();
     }
     System.out.println("]");

     if (found == 0) {
         System.out.println(word + " is not found!");
     }
 }

 public void replaceWord(String target, String replacement) {
     int count = 0;
     int start = 0;

     while (true) {
         int idx = text.indexOf(target, start);
         if (idx == -1) {
             break;
         }
         count++;
         start = idx + target.length();
     }

     if (count == 0) {
         System.out.println(target + " is not found!");
         return;
     }

     System.out.println("[" + target + "] was found " + count + " times.");
     System.out.println("-------------------------------------------");
     System.out.println("Original Text");
     System.out.println(text);

     for (int i = 1; i <= count; i++) {
         int idx = text.indexOf(target);

         String front = text.substring(0, idx);
         String back = text.substring(idx + target.length());
         text = front + replacement + back;

         System.out.println("Replaced Text [" + i + "] " + target + " -> " + replacement);
         System.out.println("-----------------------------------------------------");
         System.out.println(text);
     }
 }
}