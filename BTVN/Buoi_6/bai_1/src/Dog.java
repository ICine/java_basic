import java.util.Scanner;

public class Dog extends Animal {
    private String character;

    public Dog() {
    }

    public Dog(String name, Byte age, Float weight, String character) {
        super(name, age, weight);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap character dong vat: ");
        this.character = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Dog [character=" + character + "]");
    }

    @Override
    public void tiengKeu() {
        System.out.println("Cho keu");
    }
}
