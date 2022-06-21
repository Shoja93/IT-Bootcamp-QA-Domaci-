package domaci4nedelja;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj:");
        int n = sc.nextInt();

        int sum = 0;
        while (n != 0){

            sum = sum + n;

            System.out.println("Zbir je:"  +  sum  + " unesite sledeci broj ili 0 da izadjete iz programa:");

            n = sc.nextInt();
        }
        System.out.println("Ukupan zbir je: " + sum);
    }
}

