public class Person {
    private static String diaChi;
    private String name;
    

   

    public Person(String name) {
        this.name = name;
        diaChi = "Ha Noi";
    }

    public void display() {
        System.out.println("Ten: " + this.name);
        System.out.println("Dia chi: " + diaChi);

    }
}
