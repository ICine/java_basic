import java.util.Scanner;

public class Animal {
    protected String name;
    protected Byte age;
    protected Float weight;

    public Animal() {
    }

    public Animal(String name, Byte age, Float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
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

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten dong vat: ");
        this.name = sc.nextLine();
        System.out.print("Nhap tuoi dong vat: ");
        this.age = sc.nextByte();
        System.out.print("Nhap can nang dong vat: ");
        this.weight = sc.nextFloat();
    }

    public void output() {
        System.out.println("Animal [name=" + name + ", age=" + age + ", weight=" + weight + "]");
    }
  
    public void tiengKeu() {
        System.out.println("Dong vat keu");
    }
}
