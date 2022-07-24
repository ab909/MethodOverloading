package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        calculateScore("Tim", 500);
        calculateScore(75);
        calculateScore();
        calcuFeetAndInchesToCentrimeters(6, 11);
        calcuFeetAndInchesToCentrimeters(157);
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + " scored " + score + " points ");
        return score * 1000;
    }

    public static void calculateScore() {
        System.out.println("No player name, no player score ");
    }

    public static double calcuFeetAndInchesToCentrimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameter");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcuFeetAndInchesToCentrimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches= (int) inches % 12;
        System.out.println(inches + "Inches is equal to " + feet + " feet and " + remainingInches);
        return calcuFeetAndInchesToCentrimeters(feet, inches);
    }
    private static String getDurationString (int minutes, int seconds){
        if((minutes <= 0) || ( seconds < 0) || (seconds >59)){
        return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes/60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours  + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if(seconds <10){
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString + "";
    }
    private static String getDurationString (int seconds){
        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

}