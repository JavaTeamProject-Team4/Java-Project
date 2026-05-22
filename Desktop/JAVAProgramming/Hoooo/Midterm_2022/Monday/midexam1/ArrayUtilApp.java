// 2022111982
// 김경무

package PreviousExam.Midterm_2022.Monday.midexam1;

public class ArrayUtilApp {
    public static void main(String[] args) {
        PreviousExam.Midterm_2022.Monday.midexam1.ArrayUtil arrayUtil = new PreviousExam.Midterm_2022.Monday.midexam1.ArrayUtil();
        int[] a = new int[10];
        int[] b = new int[10];
        arrayUtil.fill(a);
        arrayUtil.fill(b);
        System.out.println("fill(a) 수행");
        System.out.println("< 배열 a 인덱스 및 내용 출력>");
        arrayUtil.print(a);

        System.out.println("fill(b) 수행");
        System.out.println("< 배열 b 인덱스 및 내용 출력>");
        arrayUtil.print(b);

        System.out.println("concat(a, b) 수행 및 배열 c 생성");
        System.out.println("< 배열 c 인덱스 및 내용 출력>");
        int[] c = new int[20];
        c = arrayUtil.concat(a, b);
        arrayUtil.print(c);

        System.out.println("compare(a, b) 수행");
        char temp = ' ';
        int flag = arrayUtil.compare(a, b);
        if (flag == 0) temp = '=';
        else if  (flag == 1) temp = '>';
        else if (flag == -1) temp = '<';
        System.out.printf("a %c b", temp);
    }
}
