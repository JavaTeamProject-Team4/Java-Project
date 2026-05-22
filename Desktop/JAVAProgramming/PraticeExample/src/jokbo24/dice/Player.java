package jokbo24.dice;

//학번 : 2025005685
//이름 : 유다경

public class Player {
 private String name;
 private int score;

 public Player(String name) {
     this.name = name;
     this.score = 0;
 }

 public String getName() {
     return name;
 }

 public int getScore() {
     return score;
 }

 public void addScore(int value) {
     score += value;
 }

 public void subtractScore(int value) {
     score -= value;
     if (score < 0) {
         score = 0;
     }
 }
}