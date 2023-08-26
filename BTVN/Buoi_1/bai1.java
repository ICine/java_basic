import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap do dai canh hinh vuong: ");

        int n;
        do {
            n = scanner.nextInt();
            if (n <= 0)
                System.out.println("Nhap lai !!!");
        } while (n <= 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Nếu nằm trên đường viền thì ta in ra ký tự *
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } // Ngược lại ta in ra ký tự khoảng trắng
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        scanner.close();

    }
}