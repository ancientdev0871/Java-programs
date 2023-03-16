import java.util.*;
public class armstrong_number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int num = n;
        int d1 = 0;
        int sum = 0;
        while (n > 0) {
            d1 = n%10;
            sum = sum+(int)Math.pow(d1, 3);
            n = n/10;
                    }
    if (sum==num){
        System.out.println("Armstrong number");
    }
    else{
        System.out.println("Not armstrong number");
    }

    }
}
