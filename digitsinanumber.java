
import java.util.Scanner;

public class digitsinanumber {
    public static void main(String[] args) {
        int dig=0;
        try(Scanner scn=new  Scanner(System.in)){
            int n=scn.nextInt();
            while(n!=0){
                n=n/10;
                dig++;
            }
        }
        System.out.println(dig);
    }
}
