import java.util.Scanner;
public class pattern11 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int u=1;
            int n=scn.nextInt();
            for(int i=1;i<n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(u);
                    u++;
                }
                System.out.println("");
            }
        }
    }
}

