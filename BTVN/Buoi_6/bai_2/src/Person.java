import java.util.Scanner;

public class Person {
    protected String name;
    protected Byte age;
    protected String address;
    protected Date birthDay;

    public Person(){

    }

    public Person(String name, Byte age, String address, Date birthDay) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten");
        this.name= sc.nextLine();
        System.out.print("Nhap tuoi");
        this.age= sc.nextByte();
                System.out.print("Nhap dia chi");
        this.address= sc.nextLine();

        System.out.print("Nhap sinh nhat");
        birthDay.input();
    }

    public void output(){
        System.out.print("name=" + name + ", age=" + age + ", address=" + address+"     ");
        birthDay.output();
    }
}
