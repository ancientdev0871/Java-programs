import java.util.*;
public class buzz__number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int n = sc.nextInt();
        int n1 = n;
        if(n%7==0 || n%10==7){
            System.out.println("Buzz number");
        }
        else {
            System.out.println("Not buzz number");
        }
    }
}
