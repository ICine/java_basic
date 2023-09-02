import java.util.Scanner;

public class Student extends Person {
    private String id;
    private String CLass;
    private String school;

    public Student() {

    }

    public Student(String name, Byte age, String address, Date birthDay, String id, String cLass, String school) {
        super(name, age, address, birthDay);
        this.id = id;
        CLass = cLass;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCLass() {
        return CLass;
    }

    public void setCLass(String cLass) {
        CLass = cLass;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id");
        this.id = sc.nextLine();
        System.out.print("Nhap lop");
        this.CLass = sc.nextLine();
        System.out.print("Nhap truong");
        this.school = sc.nextLine();
    }

    @Override
    public void output() {
        System.out.print("id=" + id + ", CLass=" + CLass + ", school=" + school + "]");
        super.output();
        System.out.println();
    }
}
