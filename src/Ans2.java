import java.util.Scanner;

public class Ans2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;

        System.out.println("Enter a String:");
        word= sc.nextLine();
        Palindrome(word);
    }

    public static void Palindrome(String word) {
        String rev="";
        int len=word.length();
        for (int i=len-1;i>=0;i--){
            rev=rev+word.charAt(i);


        }
        if (word.equals(rev)){
            System.out.println(rev+" is a palindrome ");
        }
        else {
            System.out.println(rev+" is not a palindrome ");
        }

    }

}


