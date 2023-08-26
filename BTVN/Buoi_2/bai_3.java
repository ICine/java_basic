import java.util.Scanner;

public class bai_3 {

    public static void sort_arr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
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
        scanner.close();
        // End: Input
        sort_arr(arr);
        output(arr);

    }


}
