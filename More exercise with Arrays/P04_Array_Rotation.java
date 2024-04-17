package Arrey3009;

import java.util.Arrays;
import java.util.Scanner;

public class P04_Array_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
       int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=rotation ; i++) {
            int firstNumber = numbers[0];
            for (int j = 0; j <numbers.length-1 ; j++) {
               numbers[j]=numbers[j+1];
            }
            numbers[numbers.length-1]=firstNumber;
            
        }
        for (int num:numbers) {
            System.out.print(num + " ");
        }


    }
}
