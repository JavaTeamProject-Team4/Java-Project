// 2025005685 유다경 

package first;

public class AlphabetCount {

    public void getAlphabetCount(String text){
        int[] lowerCount = new int[26];
        int[] upperCount = new int[26];
        char[] charArray =  text.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (ch >= 'a' && ch <= 'z') {
                lowerCount[ch - 'a']++;
            }
            else if (ch >= 'A' && ch <= 'Z') {
                upperCount[ch - 'A']++;
            }
        }
        System.out.println("Alphabet Count");
        for (int i = 0; i < 26; i++) {
            char curr = (char) (i + 'a');
            char curr2 = (char) (i + 'A');
            System.out.printf("%s: %2d, ", curr, lowerCount[i]);
            System.out.printf("%s: %2d \n", curr2, upperCount[i]);
            
        }d
    }
}