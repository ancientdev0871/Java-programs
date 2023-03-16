import java.util.*;
public class pell_series {
    public static void main(String [] args){
        int a = 1;
        int b = 0;
        int c;
        for(int i = 1;i<=10;i++){
            c = (2*b) + a;
            System.out.println(c);
            a = b;
            b= c;
        }
    }
}
