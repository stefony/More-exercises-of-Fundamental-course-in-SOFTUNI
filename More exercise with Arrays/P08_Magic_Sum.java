package Arrey3009;

import java.util.Arrays;
import java.util.Scanner;

public class P08_Magic_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magik = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <numbers.length ; index++) {
            int firstNumber = numbers[index];

            for (int inIndex = index+1; inIndex < numbers.length ; inIndex++) {
                int next = numbers[inIndex];
                if (firstNumber+next == magik) {
                    System.out.println(firstNumber + " " + next);
                }
            }
        }

    }
}
