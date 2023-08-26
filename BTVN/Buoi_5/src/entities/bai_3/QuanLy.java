package entities.bai_3;

import java.util.Scanner;

public class QuanLy {
    private String MaQL;
    private String HoTen;

    public QuanLy() {
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String maQL) {
        MaQL = maQL;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Nhap ma QL: ");
        this.MaQL = sc.nextLine();
        System.out.print("Nhap ten QL: ");
        this.HoTen = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("Ma QL: " + this.MaQL + ", Ho Ten: " + this.HoTen);
    }

}
