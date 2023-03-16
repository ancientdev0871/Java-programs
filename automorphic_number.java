import java.util.*;
public class automorphic_number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int n1 = n;
        int sq = n*n;
        int c = 0;
        while (n >0){
            c++;
            n = n /10;

        }
        int m = (int) Math.pow(10, c);
        if (sq%m == n1){
            System.out.println("Automorphic");
        }

    }
}
