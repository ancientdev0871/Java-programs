import java.util.*;
public class happy_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (temp > 9) {
            while (n > 0) {
                int d = n % 10;
                sum = sum + d;
                n /= 10;
            }
            temp = sum;
            sum = 0;
        }
        if (temp == 1){
            System.out.println("magic");
        }
    }
}
