import java.util.*;
public class lucas_series {
    public static void main(String[] args){
        int a = 2;
        int b = 1;
        int c;
        for(int i = 1;i<=10;i++){
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
