package Arrey3009;

import java.util.Scanner;

public class P02_Common_Elements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] first = scanner.nextLine().split(" ");
        String [] second = scanner.nextLine().split(" ");

        for (String secondElement:second) {
            for (String firstElement:first) {
                if (secondElement.equals(firstElement)){
                    System.out.print(firstElement + " ");
                    break;
                }
            }
        }

    }
}
