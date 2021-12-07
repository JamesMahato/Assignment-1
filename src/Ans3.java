import java.util.*;

class Sorted {
    public void SortStrings() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many number of strings to be sorted :");
        int n = s.nextInt();
        String[] str = new String[n];
        System.out.print("Enter "+ n +" strings :");
        for(int i =0;i<n;i++){
            str[i] = new String(s.next());
        }
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;

                }
            }
        }
        System.out.println(n+" sorted string");
        for(int i=0;i<n;i++){
            System.out.println(str[i]);
        }
    }
}
class driver
{
    public static void main(String[] args) {
        Sorted obj = new Sorted();
        obj.SortStrings();
    }
}
