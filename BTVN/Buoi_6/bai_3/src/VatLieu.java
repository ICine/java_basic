import java.util.Scanner;

public class VatLieu {
    protected String ten;
    protected String mauSac;
    protected int doCung;
    
    public VatLieu() {
    }

    public VatLieu(String ten, String mauSac, int doCung) {
        this.ten = ten;
        this.mauSac = mauSac;
        this.doCung = doCung;
    }
    

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getDoCung() {
        return doCung;
    }

    public void setDoCung(int doCung) {
        this.doCung = doCung;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        this.ten = sc.nextLine();
        System.out.print("Nhập màu sắc: ");
        this.mauSac = sc.nextLine();
        System.out.print("Nhập độ cung: ");
        this.doCung = sc.nextInt();
        sc.nextLine();
    }
    

    public void xuat(){
        System.out.println("Ten: " + ten);
        System.out.println("Mau sac: " + mauSac);
        System.out.println("Do Cung: " + doCung);    }

}
