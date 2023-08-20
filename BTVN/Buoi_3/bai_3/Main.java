package bai_3;

public class Main {
	public static void main(String[] args) {
		SinhVien[] sv = new SinhVien[5];
		for (int i = 0; i < sv.length; i++) {
			System.out.println("Nhap thong tinh SV thu " + (i + 1) + " : ");
			sv[i] = new SinhVien();
			sv[i].nhap();
		}

		System.out.println("\n");
		SinhVien.title();
		for (SinhVien i : sv) {
			i.xuat();
		}
	}
}