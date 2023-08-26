package entities.bai_3;

import java.util.Scanner;

public class May {
    private String MaMay;
    private String TenMay;
    private String TinhTrang;

    public May() {
    }
    public May(String maMay, String tenMay, String tinhTrang) {
        MaMay = maMay;
        TenMay = tenMay;
        TinhTrang = tinhTrang;
    }
    public String getMaMay() {
        return MaMay;
    }
    public void setMaMay(String maMay) {
        MaMay = maMay;
    }
    public String getTenMay() {
        return TenMay;
    }
    public void setTenMay(String tenMay) {
        TenMay = tenMay;
    }
    public String getTinhTrang() {
        return TinhTrang;
    }
    public void setTinhTrang(String tinhTrang) {
        TinhTrang = tinhTrang;
    }
    
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ma may: ");
        this.MaMay = sc.nextLine();
        System.out.print("Nhap ten may: ");
        this.TenMay = sc.nextLine();
        System.out.print("Nhap tinh trang may: ");
        this.TinhTrang = sc.nextLine();
    }

    public void Xuat(){

    }
    
}
