package domaci4nedelja;

import java.util.Scanner;

public class zadatak18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Koliko brojeva zelite da proverite: ");

        int n = sc.nextInt();
        System.out.print("Unesite broj: ");
        double x = sc.nextDouble();
        double max = x;
        double min = x;

        for (double i = 1; i < n; i++) {
            System.out.print("Unesite broj: ");
            x = sc.nextDouble();
            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;
            }
        }
        System.out.println("Najmanji broj je: " + min);
        System.out.println("Najveci broj je: " + max);
    }
}
