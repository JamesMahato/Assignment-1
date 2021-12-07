import java.util.Scanner;

public class Ans9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter distance in meters: ");
        float distance = scanner.nextFloat();

        System.out.print("Enter hour: ");
        float hr = scanner.nextFloat();

        System.out.print("Enter minutes: ");
        float min = scanner.nextFloat();

        System.out.print("Enter seconds: ");
        float sec = scanner.nextFloat();

        speed(min,sec,hr,distance);


        scanner.close();
    }

    public static void speed(float hr,float min,float sec,float distance) {
        float timeSeconds;
        float mps,kph, mph;
        timeSeconds = (hr*3600) + (min*60) + sec;
        mps = distance / timeSeconds;
        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        mph = kph / 1.609f;

        System.out.println("Your speed in meters/second is "+mps);
        System.out.println("Your speed in km/h is "+kph);
        System.out.println("Your speed in miles/h is "+mph);


    }
}