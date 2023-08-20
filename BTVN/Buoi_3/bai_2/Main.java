package bai_2;

import java.util.Scanner;

public class Main {
	static class HCN {
		private float D;
		private float R;

		public float getD() {
			return D;
		}

		public void setD(float d) {
			D = d;
		}

		public float getR() {
			return R;
		}

		public void setR(float r) {
			R = r;
		}

		public HCN() {

		}

		public HCN(float d, float r) {
			super();
			D = d;
			R = r;
		}

		/////////////////////////////////
		public void nhap() {
			Scanner sc = new Scanner(System.in);

			while (true) {
				System.out.print("Nhap chieu dai: ");
				D = sc.nextFloat();
				System.out.print("Nhap chieu rong: ");
				R = sc.nextFloat();
				if (D < R)
					System.out.println("Invalid input");
				else
					break;
			}
		}
		
		public void veHCN() {
			for (float i = 0; i < R; i++) {
				for (float j = 0; j < D; j++)
					System.out.print("* ");
				System.out.println();
			}
		}

		public float chuVi() {
			return (D + R) * 2;
		}

		public float dienTich() {
			return D * R;
		}

	}

	public static void main(String[] args) {
		HCN hcn = new HCN();
		hcn.nhap();
		
/////////////////
		System.out.println("Chieu dai HCN : " + hcn.D);
		System.out.println("Chieu rong HCN: " + hcn.R);
		System.out.println("Chu vi HCN    : " + hcn.chuVi());
		System.out.println("Dien tich HCN : " + hcn.dienTich());
		
		hcn.veHCN();
	}
}