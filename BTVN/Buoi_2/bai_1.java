import java.util.Arrays;
import java.util.Scanner;

// Thanks for https://www.youtube.com/watch?v=PJQa4vpjIm8&ab_channel=Fox-TechAcademy

public class bai_1 {

    public static void count_occurences(int[] arr) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            int count = 1;
            for (int j = i + 1; j < arr.length; j++)
                {
                    if (arr[i] == arr[j])
                        count += 1;
                    else
                        break;
                }
                System.out.println("So " + arr[i] + " xuat hien: " + count + " lan");
                i += (count - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.println("n = ");
            n = scanner.nextInt();
            if (n <= 0)
                System.out.println("Invalid Input ! ");
        } while (n <= 0);

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scanner.nextInt();

        count_occurences(arr);
        scanner.close();
    }
}