import java.util.*;
public class perfect_abundant_deficient {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int s = 0;
        for(int i = 1;i<n;i++){
            if (n%i==0) {
                s = s + i;
            }
        }
        if(s==n){
            System.out.println("Pefect number");
        }
        else if(s>n){
            System.out.println("Abundant number");
        }
        else if(s<n){
            System.out.println("Derficient number");
        }
        System.out.println(s);
    }
}
