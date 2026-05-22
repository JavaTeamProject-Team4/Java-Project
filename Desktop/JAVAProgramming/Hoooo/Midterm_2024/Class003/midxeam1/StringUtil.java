package PreviousExam.Midterm_2024.Class003.midxeam1;

// 학번: 2022111982
// 이름: 김경무

public class StringUtil {
    // 1. 단어 개수 세기 및 인덱스 출력
    public int getWordCount(String text, String searchWord) {
        int count = 0;
        int index = text.indexOf(searchWord);

        if (index == -1) {
            System.out.println(searchWord + " is not found!");
            return 0;
        }

        System.out.print("index: [");
        while (index != -1) {
            System.out.print(index + ", ");
            count++;
            index = text.indexOf(searchWord, index + searchWord.length());
        }
        System.out.println("]");
        return count;
    }

    // 2. 단어 교체
    public String replaceWord(String text, String searchWord, String replacement) {
        if (!text.contains(searchWord)) {
            System.out.println(searchWord + " is not found!");
            return "";
        }
        return text.replace(searchWord, replacement);
    }

    // 3. 문자열 자르기 (substring 사용 금지 조건 충족)
    public String sliceString(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
}
