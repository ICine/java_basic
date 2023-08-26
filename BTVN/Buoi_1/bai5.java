import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so a: ");
        double a = scanner.nextDouble();

        System.out.print("nhap so b: ");
        double b = scanner.nextDouble();

        System.out.print("nhap so c: ");
        double c = scanner.nextDouble();

        scanner.close();
        
        int x = 0;
        while (((x <= a) & (2*x <= b) & (4*x <= c)))
            x++;

        x--;
        System.out.print("=>Tong so qua toi da la: " + (x + 2*x +4*x) );
        System.out.print(" (Chanh:" + x + ", Tao: " + 2*x + ", Le: " +4*x + ")");
    }
}
