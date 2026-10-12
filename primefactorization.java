import java.util.Scanner;
public class primefactorization {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n=scn.nextInt();
            // for(inti=2;i*i<n;i++)......
            for(int i=2;i<=n;i++){
                while(n%i==0){
                    n=n/i;
                    System.out.println(i);
                }
            }
             //if (n!=1){
            //       System.out.print(n);  
              //}
        }
    }
}
