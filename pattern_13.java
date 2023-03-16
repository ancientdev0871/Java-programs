public class pattern_13 {
    public static void main(String[] args) {
        for (int i = 1;i<=5;i++){
            for (int j=1;j<=5+1-i;j++){
                System.out.print(" ");
            }
            if (i==5){
                for(int m = 8;m>=1;m--){
                    System.out.print("*");
                }
            }
            for(int k=1;k<=1;k++){
                System.out.print("*");
            }
            if(i>1){
                for(int o =1;o<=(2 * i) - 3;o++){
                    System.out.print(" ");
                }
            }
            if(i>1 && i<5){
                for(int k=1;k<=1;k++){
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}
