import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so luong: ");
        int n = sc.nextInt();
        ArrayList<HangHoaGiaDung> a = new ArrayList<HangHoaGiaDung>(n);
        ArrayList<HangHoaDienTu> b = new ArrayList<HangHoaDienTu>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap Hang hoa gia dung thu " + (i + 1));
            HangHoaGiaDung tmp = new HangHoaGiaDung();
            tmp.nhap();
            a.add(tmp);
        }
        for (HangHoaGiaDung x : a) {
            System.out.println(x.tongTien());
            x.xuat();
        }
    }
}
