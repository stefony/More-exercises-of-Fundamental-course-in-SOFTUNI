package Arrey3009;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nWagon = Integer.parseInt(scanner.nextLine());
        int [] people = new int[nWagon];
        int sum = 0;
        for (int i = 0; i <nWagon ; i++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            sum+=countPeople;
            people[i]=countPeople;
            System.out.print(people[i] + " ");

        }
        System.out.printf("%n%d",sum);



    }
}
