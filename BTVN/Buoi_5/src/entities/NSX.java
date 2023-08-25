package entities;

import java.util.Scanner;

public class NSX {
    private String MaNSX;
    private String TenNSX;
    private String DcNSX;

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String maNSX) {
        MaNSX = maNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String tenNSX) {
        TenNSX = tenNSX;
    }

    public String getDcNSX() {
        return DcNSX;
    }

    public void setDcNSX(String dcNSX) {
        DcNSX = dcNSX;
    }

    public NSX(String maNSX, String tenNSX, String dcNSX) {
        MaNSX = maNSX;
        TenNSX = tenNSX;
        DcNSX = dcNSX;
    }

    public NSX() {

    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap MaNSX: ");
        MaNSX = sc.nextLine();
        System.out.print("Nhap TenNSX: ");
        TenNSX = sc.nextLine();
        System.out.print("Nhap DcNSX: ");
        DcNSX = sc.nextLine();
    }

    public void Xuat() {
        System.out.println("MaNSX= " + MaNSX + ", TenNSX= " + TenNSX + ", DcNSX= " + DcNSX);
    }

}
