import java.util.*;
public class kaprekar_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int n1 = n;
        int sq = n*n;
        int ctr = 0;
        int r;
        int q;
        while(n>0){
            ctr++;
            n = n/10;
        }
        r = sq % (int)Math.pow(10, ctr);
        q = sq / (int)Math.pow(10, ctr);
        if((r+q)==n1){
            System.out.println("Kaprekar number");
        }
        else{
            System.out.println("Not kaprekar number");
        }

    }
}
