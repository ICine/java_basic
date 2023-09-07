import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    private int classId;
    private int numberOfStudent;
    private ArrayList<Student> listStudents;

    public Classroom() {
    }

    public Classroom(int classId, int numberOfStudent, ArrayList<Student> listStudents) {
        this.classId = classId;
        this.numberOfStudent = numberOfStudent;
        this.listStudents = listStudents;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã lớp: ");
        this.classId = sc.nextInt();

        do {
            System.out.print("Nhập số lượng học sinh: ");
            this.numberOfStudent = sc.nextInt();
            if (numberOfStudent <= 0)
                System.out.println("Invalid input");
        } while (numberOfStudent <= 0);

        listStudents = new ArrayList<Student>();

        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("Mời nhập thông tin học sinh thứ " +( i + 1) + ": ");
            Student st = new Student();
            st.input();
            listStudents.add(st);
        }
    }

    public void output() {
        System.out.println("\n\n---------------------------------------");
        int i = 1;
        for (Student st: listStudents){
            System.out.println("Thông tin học sinh thứ " + (i) + ": ");
            st.output();
            i ++;
        }
        System.out.println("---------------------------------------\n\n");
    }

    public void timSinhVien(String ten) {
        for (Student st : listStudents) {
            if (st.getName().indexOf(ten, 0) >= 0) {
                st.output();
            }
        }
    }
}
