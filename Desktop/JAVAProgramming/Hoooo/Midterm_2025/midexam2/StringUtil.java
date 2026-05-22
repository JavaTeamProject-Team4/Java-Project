package PreviousExam.Midterm_2025.midexam2;

public class StringUtil {
    private String text;

    public StringUtil(String text) {
        this.text = text;
    }

    public void searchAllIndexes(String target) {
        int index = text.indexOf(target);

        if (index == -1) {
            System.out.println(target + " is not found!");
            return;
        }

        System.out.print("index: [");
        while (index != -1) {
            System.out.print(index + ", ");
            index = text.indexOf(target, index + target.length());
        }
        System.out.println("]");
    }

    public void replaceWordOneByOne(String target, String replacement) {
        int count = 0;
        int tempIndex = text.indexOf(target);

        while (tempIndex != -1) {
            count++;
            tempIndex = text.indexOf(target, tempIndex + target.length());
        }

        if (count == 0) {
            System.out.println(target + " is not found!");
            return;
        }

        System.out.println("[" + target + "] was found " + count + " times.");
        System.out.println("Original Text");
        System.out.print(text);

        int index = text.indexOf(target);
        int step = 1;

        while (index != -1) {
            text = text.substring(0, index) + replacement + text.substring(index + target.length());

            System.out.println("Replaced Text [" + step + "] " + target + " -> " + replacement);
            System.out.print(text);

            step++;
            index = text.indexOf(target, index + replacement.length());
        }
    }
}