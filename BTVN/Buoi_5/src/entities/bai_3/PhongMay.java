package entities.bai_3;

import java.util.Scanner;

public class PhongMay {
    private String MaPhong, TenPhong;
    private Double DienTich;
    private QuanLy x = new QuanLy();
    private int n; // Số lượng máy
    private May[] y;

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, Double dienTich, QuanLy x, int n, May[] y) {
        MaPhong = maPhong;
        TenPhong = tenPhong;
        DienTich = dienTich;
        this.x = x;
        this.n = n;
        this.y = y;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String maPhong) {
        MaPhong = maPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }

    public Double getDienTich() {
        return DienTich;
    }

    public void setDienTich(Double dienTich) {
        DienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public static void title(){
        System.out.printf("%-15s%-15s%-10s%n", "MaMay", "TenMay", "TinhTrang");
    }

    public void Nhap(Scanner sc) {
        // Input Phong may
        System.out.print("Nhap ma phong: ");
        this.MaPhong = sc.nextLine();
        System.out.print("Nhap ten phong: ");
        this.TenPhong = sc.nextLine();
        System.out.print("Nhap Dien Tich phong: ");
        this.DienTich = Double.parseDouble(sc.nextLine());

        // Input Quan ly
        x.Nhap(sc);

        // Input nhap may
        while (true) {
            System.out.print("Nhap so luong may: ");
            n = Integer.parseInt(sc.nextLine());
            if (n <= 0)
                System.out.println("Invalid input");
            else
                break;
        }

        y = new May[n];
        for (int i = 0; i < y.length; i++) {
            System.out.println("Nhap may thu " + (i + 1) + ": ");
            y[i] = new May();
            y[i].Nhap(sc);
        }
    }

    public void Xuat(){
        System.out.println("MaPhong: " + this.MaPhong+
                            ", TenPhong: "+ this.TenPhong+ 
                            ", S_Phong: "+ this.DienTich);
        x.Xuat();
        System.out.println("\n");
        title();
        for (May i: y){
            i.Xuat();
        }
    }
}
