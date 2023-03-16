import java.util.*;
public class fibonacci_series {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for(int i = 1;i<=n;i++){
            c = a+b;
            System.out.println(" "+c);
            a=b;
            b=c;
        }
    }
}
