import java.util.Scanner;

// Thanks to https://www.youtube.com/watch?v=mZm93Bmb3dg&ab_channel=LearnWithKrishnaSandeep

public class bai_2 {

    public static int[] delete_ele(int[] arr, int pos) {
        pos--;
        int[] new_arr = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++)
            if (i != pos) {
                new_arr[index] = arr[i];
                index++;
            }
        return new_arr;
    }

    public static int[] append_ele(int[] arr, int pos, int element) {
        pos--;
        int[] new_arr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++)
            new_arr[i] = arr[i];

        for (int i = new_arr.length - 1; i > pos; i--)
            new_arr[i] = new_arr[i - 1];

        new_arr[pos] = element;

        return new_arr;
    }

    public static void output(int[] arr) {
        for (int i : arr)
            System.out.print(i + "\t");
        System.out.println();
    }

    public static void main(String[] args) {

        // Begin: Input
        int n;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("n = ");
            n = scanner.nextInt();
            if (n < 0)
                System.out.println("Invalid input");
        } while (n < 0);

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scanner.nextInt();

        // End: Input

        // Append element
        int pos;
        do {
            System.out.print("Nhap vi tri can them phan tu: ");
            pos = scanner.nextInt();
            if (pos < 0 | pos > arr.length)
                System.out.println("Invalid input");
        } while (pos < 0 | pos > arr.length);

        System.out.print("Nhap gia tri phan tu moi: ");
        int element = scanner.nextInt();
        int[] my_arr = append_ele(arr, pos, element);
        output(my_arr);

        // Delete element
        int pos1;
        do {
            System.out.print("Nhap vi tri can xoa phan tu: ");
            pos1 = scanner.nextInt();
            if (pos1 < 0 | pos1 > arr.length)
                System.out.println("Invalid input");
        } while (pos1 < 0 | pos1 > arr.length);
        int[] my_arr_1 = delete_ele(arr, pos1);
        output(my_arr_1);
        scanner.close();
    }
}
