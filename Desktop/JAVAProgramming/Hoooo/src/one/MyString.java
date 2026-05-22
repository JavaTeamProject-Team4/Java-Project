package one;

public class MyString {

    public void getAlphabetCount(String text){
        // 26-1 기준 charArray 안배웠긴 함
        // 근데 이거 아니면 풀 방법이 없어서 걍 썼음 ㅇㅇ
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
        System.out.println("소문자 개수: ");
        for (int i = 0; i < 26; i++) {
            char curr = (char) (i + 'a');
            System.out.printf("[%s]: %2d ", curr, lowerCount[i]);
            if (i == 12 || i == 25) System.out.println();
        }

        for (int i = 0; i < 26; i++) {
            char curr = (char) (i + 'A');
            System.out.printf("[%s]: %2d ", curr, upperCount[i]);
            if (i == 12 || i == 25) System.out.println();
        }
    }
    public void searchWord(String text, String word) {
        int cnt = 0;
        int wordLen = word.length(); // 검색어의 길이
        int textLen = text.length(); // 전체 텍스트의 길이

        for (int i = 0; i <= textLen - wordLen; i++) {
            String slice = text.substring(i, i + wordLen);
            if (word.equals(slice)) {
                cnt++;
            }
        }

        System.out.printf("검색 결과 %s:%2d 개\n", word, cnt);
    }
}