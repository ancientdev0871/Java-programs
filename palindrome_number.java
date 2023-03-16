import java.util.*;
public class palindrome_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int n1 = n;
        int rev = 0;
        while (n>0){
            int r = n%10;
             rev = rev*10+r;
             n = n/10;
        }
        if(rev==n1){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not palindrome number");
        }
    }
}
