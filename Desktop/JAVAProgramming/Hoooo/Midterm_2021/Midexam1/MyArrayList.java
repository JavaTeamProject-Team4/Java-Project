package PreviousExam.Midterm_2021.Midexam1;

import java.util.ArrayList;


// 2026-1 Midterm 기준 ArrayList 안배움
public class MyArrayList {
    private ArrayList<String> list = new ArrayList<>();

    public void splitString(String msg) {
        String[] words = msg.split(" ");
        for (int i = 0; i < words.length; i++) {
            list.add(words[i]);
        }
    }

    public void replace(String oldStr, String newStr) {
        int index = list.indexOf(oldStr);
        if (index != -1) {
            list.set(index, newStr);
            System.out.println("문자열 교체: " + oldStr + "->" + newStr);
        } else {
            System.out.println("해당 문자열이 ArrayList에 존재하지 않습니다.");
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}