import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        int flag = 0;
        int len = str.length();

        for (int i = 0; i <= len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}
