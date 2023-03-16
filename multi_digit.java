import java.util.*;
public class multi_digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int n1 = n;
        int d = 0;
        int sq=0,cb=0;
        while (n>0){
            d = n%10;
            if(d%2==0){
                sq = (int) Math.pow(d, 2);
                System.out.println(sq);
            }
            else if(d%2!=0){
                cb = (int) Math.pow(d, 3);
                System.out.println(cb);
            }
            n = n/10;
        }
    }
}
