package btvn;

import java.util.Scanner;

import entities.bai_2.Student;

public class Bai_2 {
    public static void main(String[] args) {
        int n;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap so luong hoc sinh: ");
            n = sc.nextInt();
            if (n <= 0)
                System.out.println("Invalid input");
            else
                break;
        }
        Student[] students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].input();
        }

        System.out.println("\n\n");
        for (Student i : students) {
            i.output();
        }
        System.out.println("\n\n");

    }
}
