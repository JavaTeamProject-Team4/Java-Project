// 2022111982
// 김경무

package PreviousExam.Midterm_2023.midexam1;

import java.util.Scanner;

public class MyStringApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String javaWiki = """
            James Gosling, Mike Sheridan, and Patrick Naughton initiated the Java language project
            in June 1991. Java was originally designed for interactive television,
            but it was too advanced for the digital cable television industry at the time.
            The language was initially called Oak after an oak tree that stood outside Gosling's.
            office. Later the project went by the name Green and was finally renamed Java,
            from Java coffee, a type of coffee from Indonesia. Gosling designed Java
            with a C/C++-style syntax that system and application programmers would find familiar.
            Sun Microsystems released the first public implementation as Java 1.0 in 1996.
            It promised write once, run anywhere (WORA) functionality,
            providing no-cost run-times on popular platforms.
            """;
        MyString myString = new MyString();
        myString.getAlphabetCount(javaWiki);

        while(true){
            System.out.print("Input a search string(type quit to quit): ");
            String searchWord = sc.nextLine();
            if (searchWord.equals("quit")){
                System.out.println("Exit Program.");
                break;
            }
            myString.searchWord(javaWiki, searchWord);
        }



    }
}
