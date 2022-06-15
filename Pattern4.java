public class Pattern4{
    public static void main(String[] args) {
        for(int i=0;i<4;i++){
            for(int j=0;j<3-i;j++){
                System.out.print(" ");
            }
            for(int j=3-i;j<4;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}