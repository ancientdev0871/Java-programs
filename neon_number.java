import java.util.*;
public class neon_number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int num = n;
        int digit = 0;
        int sum = 0;
        int m = n*n;
        while(m>0){
            digit = m%10;
            sum = sum+digit;
            m = m/10;
        }
        if(num==sum){
            System.out.println("Neon number");
        }
        else{
            System.out.println("Not neon number");
        }

    }
}