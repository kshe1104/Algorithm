

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int hour = sr.nextInt();
        int minute = sr.nextInt();
        int cook = sr.nextInt();
        int cook_hr = cook / 60;
        int cook_min = cook % 60;

        hour += cook_hr;
        minute += cook_min;

        if(minute>59){
            hour += minute / 60;
            minute = minute % 60;

        }
        if(hour>23){
            hour %= 24;
        }
        System.out.println(hour + " " + minute);
    }
}
