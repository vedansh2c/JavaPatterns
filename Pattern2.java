public class Pattern2 {
    public static void main(String[] args) {
        for(int j=1;j<=4;j++){
            for(int i=1;i<=4;i++){
                if(j==1 || j==4)
                System.out.print("*");
                else{
                    if(i==1 || i==4)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}
