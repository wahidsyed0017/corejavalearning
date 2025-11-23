package loops;

import java.util.Scanner;

public class negative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("negative");
        } else if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println("zero");
        }
    }
}