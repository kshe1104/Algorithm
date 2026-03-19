import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int dice1 = sr.nextInt();
        int dice2 = sr.nextInt();
        int dice3 = sr.nextInt();

        int price = 0;
        if (dice1 == dice2 && dice2 == dice3) {
            price = 10000 + (dice1 * 1000);
        }
        else if((dice1!=dice2&&dice2!=dice3)&&dice1!=dice3){
            int max = Math.max(dice1, dice2);
            max = Math.max(max, dice3);
            price = max*100;
        }
        else{
            if(dice1==dice2){
                price = 1000+dice1*100;
            } else if (dice1==dice3) {
                price = 1000+dice1*100;
            }
            else{
                price = 1000 + dice2 * 100;
            }
        }
        System.out.println(price);

    }
}
