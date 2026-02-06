import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        for(int i=n;i>0;i--){
            for(int k=n;k>i;k--){
                 System.out.print(" ");
            }
            for(int j=0;j<i;j++){
            System.out.print("*");
            }
            System.out.println("");
        }
    }
}