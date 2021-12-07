import java.util.Scanner;

    public class Ans7 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input first floating­point number: ");
            double num1 = input.nextDouble();
            System.out.print("Input second floating­point number: ");
            double num2 = input.nextDouble();
            input.close();
            dec(num1,num2);


        }

        public static void dec(double num1,double num2) {
            if (Math.abs(num1 - num2) <= 0.01) {
                System.out.println("These numbers are the same.");
            }
            else {
                System.out.println("These numbers are different.");
            }

        }
    }

