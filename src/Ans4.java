import java.util.Scanner;

public class Ans4 {
    public static void main(String[] args) {
        int num;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        num= sc.nextInt();
        sum(num);

    }

    public static void sum( int num) {
        int sum=0;
        for (int i=0;i<num;i++){
            sum=sum+i;
            System.out.println(i);
        }
        System.out.println(sum);

    }
}
