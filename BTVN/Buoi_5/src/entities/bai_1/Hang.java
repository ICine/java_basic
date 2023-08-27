package entities.bai_1;

import java.util.Scanner;

public class Hang {
    private String MaHang;
    private String TenHang;
    private NSX x = new NSX();

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String maHang) {
        MaHang = maHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }

    public NSX getX() {
        return x;
    }

    public void setX(NSX x) {
        this.x = x;
    }

    public Hang(String maHang, String tenHang, NSX x) {
        MaHang = maHang;
        TenHang = tenHang;
        this.x = x;
    }

    public Hang() {
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma hang: ");
        MaHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        TenHang = sc.nextLine();
        x.Nhap();
        sc.close();
    }

    public void Xuat() {
        System.out.println("MaHang= " + MaHang + ", TenHang= " + TenHang);
        x.Xuat();
    }

}
