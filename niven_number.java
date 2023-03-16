import java.util.*;
public class niven_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int sum = 0;
        int digit;
        while (n >0){
            digit = n%10;
            sum = digit+sum;
            n = n/10;

        }
        if(n%sum==0) {
            System.out.println("Harshad number");
        }
        else{
            System.out.println("Not harshad number");
        }
    }
}
