import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter so luong sinh vien: ");
        int n = sc.nextInt();
        ArrayList<Student> students = new ArrayList<Student>();
        System.out.println(students.size());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập sinh viên thứ " + (i + 1) + ": ");
            Student st = new Student();
            st.input();
            students.add(st);
        }
        System.out.println("\n\n");
        for (Student student : students) {
            student.output();
        }
        System.out.println("\n\n");

    }
}
