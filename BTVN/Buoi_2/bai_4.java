import java.util.Scanner;

// Thanks to https://www.youtube.com/watch?v=zSYXDhntu5Y&ab_channel=BTechComputerScience

public class bai_4 {

    public static boolean isPalindrome(String string) {
        int i = 0, j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String my_string = scanner.nextLine();
        scanner.close();
        if (isPalindrome(my_string))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
