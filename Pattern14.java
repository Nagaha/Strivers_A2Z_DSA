public class Pattern14 {
    public static void main(String args[]){
        int ch=65;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)ch);
                ch++;
            }
            ch=65;
            System.out.println();
        }
    }
}
