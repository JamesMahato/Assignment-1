import java.util.Scanner;

public class Ans10 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int number,result = 0;
        System.out.println("Enter a three digit number:");
        number= sc.nextInt();
        armstrong(number,result);

    }

    public static void armstrong(int number,int result) {
        int originalNumber,remainder;
        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

    }
}
