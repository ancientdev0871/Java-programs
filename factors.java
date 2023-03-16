import java.util.*;
public class factors {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int c = 0;
        for(int i = 2; i<n; i++){
            if(n%i==0) {
                System.out.println(i);
                c++;
            }
        }
        System.out.println(c);
    }
}
