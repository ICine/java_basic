import java.util.Scanner;

public class bai2 {
    static double caua(int n) {
        double res = 1;
        for (int i = 2; i <= n; i++)
            res += (float) 1 / i;

        return res;
    }

    static int caub(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int fac = 1;
            for (int j = 2; j <= i; j++)
                fac *= j;
            res += fac;
        }
        return res;
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

        System.out.printf("Ket qua cau a la: %.2f", caua(n));
        System.out.print("\nKet qua cau b la: " + caub(n));

        scanner.close();
    }
}
