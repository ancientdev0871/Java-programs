public class pattern_14 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            if(i==1){
                for(int k = 7;k>=0;k--){
                    System.out.print("*");
                }
            }
            for(int j = 1;j<=1;j++){
                System.out.print("*");
            }
            if(i>1){
                for(int j = 1;j<=8+1-(2*i);j++){
                    System.out.print(" ");
                }
            }
            if(i>1 && i<5){
                for(int j = 1; j<=1;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
