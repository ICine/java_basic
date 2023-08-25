package entities;

public class School {
    private String Name;
    private String Date;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public School(String name, String date) {
        Name = name;
        Date = date;
    }

    public School() {
        this.Name = "HaUi";
        this.Date = "10/08/1898";
    }

    public void output(){
        System.out.printf("%-20s%-10s%n", Name, Date);
    }
}
