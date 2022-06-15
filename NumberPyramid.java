public class NumberPyramid {
    public static void main(String[] args) {
    int m=5;
    int number=1;
    for(int i=1;i<=m;i++){
        for(int j=i;j<=5;j++){
            System.out.print("_");
        }
        for(int j=1;j<=2*i-1;j++){
            if(number==1){
                System.out.print(i);
                number=0;
            }
            else{
                System.out.print("_");
                number=1;
            }
            
        }
        number=1;
        for(int j=5;j>=i;j--){
            System.out.print("_");
        }
        System.out.println("");
    }
}
}
