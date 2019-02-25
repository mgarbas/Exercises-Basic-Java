package Basic;

import java.util.Scanner;

public class SecondsToTime {

    // The program converts the given number of seconds into hh:mm:ss

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the number of seconds");
        int seconds = scan.nextInt();
        int hours = seconds / 3600;
        int seconds2 = seconds % 3600;
        int minutes = seconds2 / 60;
        int secondsFinal = seconds2 % 60;

        String hour;
        if (hours < 10) {
            hour = String.valueOf(hours);
            hour = "0" + hours;
        }else {
            hour = String.valueOf(hours);
        }

        String minute;
        if (minutes < 10) {
            minute = String.valueOf(minutes);
            minute = "0" + minute;
        }else {
            minute = String.valueOf(minutes);
        }
        String second;
        if (secondsFinal < 10) {
            second = String.valueOf(secondsFinal);
            second = "0" + second;
        }else {
            second = String.valueOf(secondsFinal);
        }

        System.out.println(hour + ":" + minute + ":" + second);
    }
}
