package domaci4nedelja;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {


            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if ( i % 7 ==0 && i % 11 == 0){
                System.out.println("ZazzRazz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0){
                System.out.println("Zazz");
            } else if (i % 11 ==0){
                System.out.println("Razz");
            } else {
                System.out.println(i);
            }
        }
    }
}
