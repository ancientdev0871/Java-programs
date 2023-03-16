class pattern_19
{
    public static void main(String args[])
    {
        for(int i = 1; i <= 5; i++){
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            for (int k=1;k<=9+1-(2 * i);k++){
                System.out.print(" ");
            }
            for(int l = 1;l<=i;l++){
                System.out.print("*");
            }


            System.out.println();
        }
        // down
        for (int i = 1;i<=4;i++){
            for (int j=1;j<=4+1-i;j++){
                System.out.print("*");
            }
            for(int n = 1; n <= (2 * i);n++ ){
                System.out.print(" ");
            }
            for (int j=1;j<=4+1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
