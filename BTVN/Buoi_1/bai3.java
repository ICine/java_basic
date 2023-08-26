import java.util.Scanner;
import java.lang.Math;

public class bai3 {

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return n > 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n > 0: ");

        int n;
        do {
            n = scanner.nextInt();
            if (n <= 0)
                System.out.println("Nhap lai !!!");
        } while (n <= 0);

        if (isPrime(n))
            System.out.println(n + " la so nguyen to");
        else
            System.out.println(n + " khong la so nguyen to");

        scanner.close();
    }
}
