package btvn;

import java.util.Scanner;

import entities.bai_1.Hang;

public class Bai_1 {
    public static void main(String[] args) {
        Hang hang = new Hang();
        Scanner sc = new Scanner(System.in);

        hang.Nhap(sc);

        System.out.println("\n");
        hang.Xuat();
        System.out.println("\n");
    }
}