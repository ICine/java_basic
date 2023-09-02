import java.util.Scanner;

public class Cat extends Animal {
    private String color;
    private String preferences;
    private String ownerName;

    public Cat() {

    }

    public Cat(String name, Byte age, Float weight, String color, String preferences, String ownerName) {
        super(name, age, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau dong vat: ");
        this.color = sc.nextLine();
        System.out.print("Nhap pre dong vat: ");
        this.preferences = sc.nextLine();
        System.out.print("Nhap chu dong vat: ");
        this.ownerName = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Cat [color=" + color + ", preferences=" + preferences + ", ownerName=" + ownerName + "]");
    }

    @Override
    public void tiengKeu() {
        System.out.println("Meo keu");
    }
}
