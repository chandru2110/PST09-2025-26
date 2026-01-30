package project1.pst;
import java.util.Scanner;

public class primenumbercheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int temp = 0;

        if (num <= 1) {
            temp = 1;   
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    temp = 1;
                    break;
                }
            }
        }

        if (temp == 0)
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is NOT a Prime number");
    }
}
