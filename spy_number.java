import java.util.*;
public class spy_number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int n1 = n;
        int digit = 0;
        int sum = 0;
        int product = 1;
        while(n>0){
            digit = n%10;
            sum = sum + digit;
            product = product * digit;
            n = n/10;
        }
      if(sum==product){
          System.out.println("Spy number");
      }
      else{
          System.out.println("Not spy number");
      }
    }
}
