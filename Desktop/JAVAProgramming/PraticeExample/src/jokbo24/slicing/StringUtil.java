package jokbo24.slicing;

//학번 : 2025005685
//이름 : 유다경

public class StringUtil {

 public int getWordCount(String text, String searchWord) {
     int count = 0;
     int index = 0;

     while (true) {
         index = text.indexOf(searchWord, index);

         if (index == -1) {
             break;
         }

         if (count == 0) {
             System.out.print("index: [");
         }

         System.out.print(index + ", ");
         count++;
         index += searchWord.length();
     }

     if (count > 0) {
         System.out.println("]");
     } else {
         System.out.println(searchWord + " is not found!");
     }

     return count;
 }

 public String replaceWord(String text, String searchWord, String replacement) {
     int count = getWordCount(text, searchWord);

     if (count == 0) {
         return "";
     }

     String result = "";
     int start = 0;
     int foundIndex;

     while (true) {
         foundIndex = text.indexOf(searchWord, start);

         if (foundIndex == -1) {
             result += text.substring(start);
             break;
         }

         result += text.substring(start, foundIndex);
         result += replacement;
         start = foundIndex + searchWord.length();
     }

     return result;
 }

 public String sliceString(String text, int start, int end) {
     String result = "";

     for (int i = start; i < end; i++) {
         result += text.charAt(i);
     }

     return result;
 }
}