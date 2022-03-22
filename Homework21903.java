package homework;

import java.util.Scanner;

public class Homework21903 {
    public static void main(String[] args) {
        int numA;
        System.out.println("Въведете число ");
        Scanner scanner = new Scanner(System.in);
        numA = scanner.nextInt();
        int  numB = numA % 2;
        String result = numB == 0 ? "четно": "нечетно";
        System.out.println(result);

    }
}
