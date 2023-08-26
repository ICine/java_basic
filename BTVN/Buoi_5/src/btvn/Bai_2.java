package btvn;

import java.util.Scanner;

import entities.bai_2.Student;

public class Bai_2 {
    public static void title(){
        System.out.printf("%-20s%-10s%-10s%-20s%-10s%-20s%-10s%n", "TEN SV", "LOP SV", "DIEM SV", "KHOA", "NGAY KHOA", "TRUONG", "NGAY TRUONG");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Nhap so luong hoc sinh: ");
            n = Integer.parseInt(sc.nextLine());
            if (n <= 0)
                System.out.println("Invalid input");
            else
                break;
        }
        Student[] students = new Student[n];

        
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nNhap sinh vien thu " + (i+ 1)+": ");
            students[i] = new Student();
            students[i].input(sc);
        }

        System.out.println("\n\n");
        title();
        for (Student i : students) {
            i.output();
        }
        System.out.println("\n\n");

    }
}
