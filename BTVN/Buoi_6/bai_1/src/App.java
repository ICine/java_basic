public class App {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        Dog dog= new Dog();

        System.out.println("Nhap thong tin con meo");
        cat.input();
        System.out.println("Nhap thong tin con cho");
        dog.input();

        System.out.println("\n\n");
        cat.output();
        System.out.println("\n");
        dog.output();
        System.out.println("\n\n");

    }
}
