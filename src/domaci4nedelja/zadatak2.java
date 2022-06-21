package domaci4nedelja;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite brojeve: ");

        int n = sc.nextInt();
        int m = sc.nextInt();
        int suma = 0;
        if (n==m){
            System.out.println("Morate uneti razlicite brojeve.");
        }
            else if (n>m){
                while (n >= m){
                    suma = suma + m;
                    m++;
            }
            System.out.println("Ukupan zbir je:" + suma);
        }
            else {
                while (n <= m){
                    suma = suma +n;
                    n++;
            }
            System.out.println("Ukupan zbir je:" + suma);
        }

    }
}
