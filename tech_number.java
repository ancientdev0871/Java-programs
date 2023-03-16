import java.util.*;
public class tech_number {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int n1 = n;
        int digits = 0;
        int r,q;
            while(n>0){
                digits++;
                n = n/10;
            }
        r = n1 % (int) Math.pow(10, digits/2);
        q = n1 / (int) Math.pow(10, digits/2);
        int sum = (r+q)*(r+q);
        if(sum==n1){
            System.out.println("Tech  number");
        }
        else{
            System.out.println("Not tech number");
        }
    }
}
