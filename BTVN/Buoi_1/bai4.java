import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhap so b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhap so c: ");
        double c = scanner.nextDouble();

        scanner.close();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Phuong trinh co nghiem kep x1 = x2 = %.2f", x1);
        } else {
            double y1 = (-b + Math.sqrt(delta)) / (2 * a);
            double y2 = (-b - Math.sqrt(delta)) / (2 * a);
            if (y1 > 0) {
                double x1 = Math.sqrt(y1);
                double x2 = -Math.sqrt(y1);
                if (y2 > 0) {
                    double x3 = Math.sqrt(y2);
                    double x4 = -Math.sqrt(y2);
                    System.out.printf("Phuong trinh co 4 nghiem phan biet: %.2f, %.2f, %.2f, %.2f", x1, x2, x3, x4);
                } else if (y2 == 0) {
                    System.out.printf("Phuong trinh co 3 nghiem phan biet: %.2f, %.2f, 0", x1, x2);
                } else {
                    System.out.printf("Phuong trinh co 2 nghiem phan biet: %.2f, %.2f", x1, x2);
                }
            } else if (y1 == 0) {
                if (y2 > 0) {
                    double x3 = Math.sqrt(y2);
                    double x4 = -Math.sqrt(y2);
                    System.out.printf("Phuong trinh co 3 nghiem phan biet: 0, %.2f, %.2f", x3, x4);
                } else if (y2 == 0) {
                    System.out.println("Phuong trinh co nghiem kep x1 = x2 = 0");
                } else {
                    System.out.printf("Phuong trinh co 2 nghiem phan biet: 0, %.2f", Math.sqrt(y2), -Math.sqrt(y2));
                }
            } else {
                if (y2 > 0) {
                    double x3 = Math.sqrt(y2);
                    double x4 = -Math.sqrt(y2);
                    System.out.printf("Phuong trinh co 4 nghiem phan biet: %.2f, %.2f, %.2f, %.2f", Math.sqrt(y1),
                            -Math.sqrt(y1), x3, x4);
                } else if (y2 == 0) {
                    System.out.printf("Phuong trinh co 3 nghiem phan biet: %.2f, %.2f, 0", Math.sqrt(y1),
                            -Math.sqrt(y1));
                } else {
                    System.out.printf("Phuong trinh co 2 nghiem phan biet: %.2f, %.2f", Math.sqrt(y1), -Math.sqrt(y1));
                }
            }
        }
    }
}
