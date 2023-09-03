import java.util.ArrayList;
import java.util.Scanner;

public class HangHoa {
    private String maHang;
    private String tenHang;
    private float soLuong;
    private float donGia;
    private int n; // Số lượng vật liệu của dsVL
    private ArrayList<VatLieu> dsVL;

    public HangHoa() {
        dsVL = new ArrayList<VatLieu>();
    }

    public HangHoa(String maHang, String tenHang, float soLuong, float donGia,
            ArrayList<VatLieu> dsVL) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.dsVL = dsVL;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public ArrayList<VatLieu> getDsVL() {
        return dsVL;
    }

    public void setDsVL(ArrayList<VatLieu> dsVL) {
        this.dsVL = dsVL;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        this.maHang = sc.nextLine();
        System.out.print("Nhập tên hàng: ");
        this.tenHang = sc.nextLine();
        System.out.print("Nhập số lượng hàng: ");
        this.soLuong = sc.nextFloat();
        System.out.print("Nhập đơn giá hàng: ");
        this.donGia = sc.nextFloat();

        System.out.print("Nhập số lượng dsVL: ");
        this.n = sc.nextInt();
        System.out.println("Nhập danh sách vật liệu: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vat lieu " + (i + 1));
            VatLieu vl = new VatLieu();
            vl.nhap();
            dsVL.add(vl);
        }

    }

    public void xuat() {
        System.out.println("Ma Hang: " + maHang);
        System.out.println("Ten Hang: " + tenHang);
        System.out.println("So luong: " + soLuong);
        System.out.println("Don gia: " + donGia);
        System.out.println();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Vat Lieu " + (i + 1));
            dsVL.get(i).xuat();
            System.out.println();
        }
    }

    public float tongTien() {
        return this.soLuong * this.donGia;
    }
}
