public class ButterflyPattern {
    public static void main(String[] args) {
            for(int j=1;j<=4;j++){
                for(int k=1;k<=4;k++){
                    if(k<=j)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                for(int k=1;k<=4;k++){
                    if(k<=4-j)
                    System.out.print(" ");
                    else
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int j=4;j>=1;j--){
                for(int k=1;k<=4;k++){
                    if(k<=j)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                for(int k=1;k<=4;k++){
                    if(k<=4-j)
                    System.out.print(" ");
                    else
                    System.out.print("*");
                }
                System.out.println("");
            }
    }
}
