package Arrey3009;

import java.util.Scanner;

public class P03_Zig_Zag_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());

        String [] first = new String[row];
        String[] second = new String[row];

        for (int i = 1; i <= row; i++) {
        String [] input = scanner.nextLine().split(" ");
        String firstNumber= input[0];
        String secondNumber = input[1];

        if (i % 2 ==0){
            second[i-1]=firstNumber;
            first[i-1]=secondNumber;
        }else {
            first[i-1]=firstNumber;
            second[i-1]=secondNumber;

        }
        }
        System.out.println(String.join(" ",first));
        System.out.println(String.join(" ",second));
    }
}
