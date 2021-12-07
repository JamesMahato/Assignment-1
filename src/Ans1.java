import java.util.Scanner;

public class Ans1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        //capture the input in an integer
        int num = scan.nextInt();
        prime(num);
    }

    public static void prime(int num) {
        for (int i = 2; i <= num; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("prime numbers between 2 and "+num+ " are " + i);
            }


        }

    }

}