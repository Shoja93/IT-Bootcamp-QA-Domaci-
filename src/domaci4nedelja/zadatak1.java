package domaci4nedelja;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Uneti broj: ");
        int n = sc.nextInt();
        System.out.println("Ispis: ");
        int x = 1;
        while (x <= n) {
            if (x % 2 == 0){
            System.out.println(x);
            }
            x++;
        }
    }
}
