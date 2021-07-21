package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Karan", calculateHighScore(1500));
        displayHighScorePosition("Kashin", calculateHighScore(900));
        displayHighScorePosition("John", calculateHighScore(400));
        displayHighScorePosition("Pete", calculateHighScore(50));
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position + " on the score table");
    }

    public static int calculateHighScore(int playerScore){

        int position = 4;
        if(playerScore >= 1000){
            position= 1;
        }else if(playerScore>=500 ){
            position= 2;
        }else if(playerScore>=100 ){
            position= 3;
        }
        return position;
    }
}
