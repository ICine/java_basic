import java.util.Scanner;

public class App {
    static int tongSoNguyenTrongChuoi(String str) {
        String temp = "0";

        int sum = 0;

        for (int i = 0; i < str.length(); i ++){
            char ch = str.charAt(i);

            if (Character.isDigit(ch))
                temp += ch;
            else {
                sum += Integer.parseInt(temp);

                temp = "0";
            }
        }

        return sum + Integer.parseInt(temp);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String my_str;
        do {
            System.out.print("Nhập chuỗi: ");
            my_str = sc.nextLine();
        } while (my_str.length() > 18);

        System.out.println("Tổng số nguyên: " + tongSoNguyenTrongChuoi(my_str));
    }
}
