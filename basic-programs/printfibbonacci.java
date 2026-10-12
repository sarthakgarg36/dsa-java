
import java.util.Scanner;

public class printfibbonacci {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n=scn.nextInt();
            int prev=0;
            int next=1;
            System.out.println(prev);
            System.out.println(next);
            for(int i=2;i<=n;i++){
                int sum=prev+next;
                System.out.println(sum);
                prev=next;
                next=sum;
            }
        }
    }
}