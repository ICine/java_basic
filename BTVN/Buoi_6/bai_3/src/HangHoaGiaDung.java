import java.util.ArrayList;
import java.util.Scanner;

public class HangHoaGiaDung extends HangHoa {
    private String chucNang;

    public HangHoaGiaDung() {
    }

    public HangHoaGiaDung(String maHang, String tenHang, float soLuong, float donGia, ArrayList<VatLieu> dsVL,
            String chucNang) {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        this.chucNang = chucNang;
    }

    public String getChucNang() {
        return chucNang;
    }

    public void setChucNang(String chucNang) {
        this.chucNang = chucNang;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuc nang");
        this.chucNang = sc.nextLine();
        super.nhap();
    }

    public void xuat() {
        System.out.print("chucNang: " + this.chucNang);
        super.xuat();
    }
}
