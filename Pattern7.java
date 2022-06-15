public class Pattern7 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                if((i+1)%2!=0){
                    if((j+1)%2!=0)
                    System.out.print(1);
                    else 
                    System.out.print(0);
                }
                
                else{
                    if((j+1)%2!=0)
                    System.out.print(0);
                    else 
                    System.out.print(1);
                }
            }
            System.out.println("");
        }
    }
}
