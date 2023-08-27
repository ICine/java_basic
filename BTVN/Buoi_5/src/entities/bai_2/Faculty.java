package entities.bai_2;

import java.util.Scanner;

public class Faculty {
    private String Name;
    private String Date;
    private School x = new School();

    public Faculty() {

    }

    public Faculty(String name, String date, School x) {
        Name = name;
        Date = date;
        this.x = x;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public School getX() {
        return x;
    }

    public void setX(School x) {
        this.x = x;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten khoa: ");
        Name = sc.nextLine();
        System.out.print("Nhap ngay: ");
        Date = sc.nextLine();
    }

    public void output() {
        System.out.printf("%-20s%-10s", Name, Date);
        x.output();

    }
}
