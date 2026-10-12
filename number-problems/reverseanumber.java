import java.util.Scanner;
public class reverseanumber {
    public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
        int n=scn.nextInt();
        while(n>0){
            int t=n%10;
            n=n/10;
            System.out.println(t);
        }
    }
}
}