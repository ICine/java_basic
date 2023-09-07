import java.util.Scanner;

public class Student extends Person {
    private int id;
    private Address address;
    private double gpa;

    public Student() {

    }

    public Student(String name, int age, String gender, int id, Address address, double gpa) {
        super(name, age, gender);
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id: ");
        this.id = sc.nextInt();

        address = new Address();
        address.input();

        System.out.print("Nhập gpa: ");
        this.gpa = sc.nextDouble();
    }

    public void output() {
        super.output();

        System.out.println("ID: " + this.id);

        address.output();

        System.out.println("GPA: " + this.gpa);
    }
}
