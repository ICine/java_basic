import java.util.Scanner;

public class Address {
    private String city;
    private String district;

    public Address() {
    }

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thành phố: ");
        this.city = sc.nextLine();
        System.out.print("Nhập quận: ");
        this.district = sc.nextLine();
    }

    public void output() {
        System.out.println("Thành phố: " + this.city);
        System.out.println("Quận: " + this.district);
    }
}
