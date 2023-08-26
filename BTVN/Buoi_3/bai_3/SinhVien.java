package bai_3;

import java.util.Scanner;

public class SinhVien {
	private String maSinhVien;
	private String hoTen;
	private float diemToan;
	private float diemLy;
	private float diemHoa;

	public SinhVien() {

	}

	public SinhVien(String maSinhVien, String hoTen, float diemToan, float diemLy, float diemHoa) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	public float getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}

	public float getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap MSV: ");
		maSinhVien = sc.nextLine();
		System.out.print("Nhap Ten: ");
		hoTen = sc.nextLine();
		System.out.print("Nhap Diem Toan: ");
		diemToan = sc.nextFloat();
		System.out.print("Nhap Diem Ly: ");
		diemLy = sc.nextFloat();
		System.out.print("Nhap Diem Hoa: ");
		diemHoa = sc.nextFloat();
	}

	public float diemTB() {
		return (this.diemToan + this.diemLy + this.diemHoa) / 3;
	}

	public static void title() {
		System.out.printf("%-10s%-20s%-15s%-15s%-15s%-10s%n", "MSV", "Ten", "Toan", "Ly", "Hoa", "DTB");
	}

	public void xuat() {
		System.out.printf("%-10s%-20s%-15s%-15s%-15s%-10s%n", maSinhVien, hoTen, diemToan, diemLy, diemHoa, diemTB());
	}
}