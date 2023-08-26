package entities.bai_2;

import java.util.Scanner;

public class Student {
    private String Name;
    private String CLass;
    private Double Score;
    private Faculty y = new Faculty();
    private static int counter = 0;

    public Student() {
        counter ++ ;
    }

    public Student(String name, String class1, Double score, Faculty y) {
        Name = name;
        CLass = class1;
        Score = score;
        this.y = y;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCLass() {
        return CLass;
    }

    public void setCLass(String cLass) {
        CLass = cLass;
    }

    public Double getScore() {
        return Score;
    }

    public void setScore(Double score) {
        Score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }

    public void input(Scanner sc) {
        System.out.print("Nhap ten sv: ");
        Name = sc.nextLine();
        System.out.print("Nhap lop sv: ");
        CLass = sc.nextLine();
        System.out.print("Nhap diem sv: ");
        Score = sc.nextDouble();
        y.input(sc);
    }

    public void output() {
        System.out.printf("%-20s%-10s%-10s%n", Name, CLass, Score);
        y.output();
    }

}
