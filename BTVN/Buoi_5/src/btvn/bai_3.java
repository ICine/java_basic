package btvn;

import java.util.Scanner;

import entities.bai_3.PhongMay;

public class bai_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhongMay pm = new PhongMay();
        
        pm.Nhap(sc);
        
        System.out.println("\n\n");
        pm.Xuat();
        System.out.println("\n\n");

    }
}
