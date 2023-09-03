import java.util.ArrayList;
import java.util.Scanner;

public class HangHoaDienTu extends HangHoa {
    private int thoiGianBaoHanh;
    private int congSuat;

    public HangHoaDienTu() {
    }

    public HangHoaDienTu(String maHang, String tenHang, float soLuong, float donGia, ArrayList<VatLieu> dsVL,
            int thoiGianBaoHanh, int congSuat) {
        super(maHang, tenHang, soLuong, donGia, dsVL);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh: ");
        this.thoiGianBaoHanh = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap cong suat: ");
        this.congSuat = Integer.parseInt(sc.nextLine());
    }

    public void xuat() {
        System.out.println("Thoi gian bao hanh: " + thoiGianBaoHanh);
        System.out.println("Cong suat: " + congSuat);
        super.xuat();
    }
}
