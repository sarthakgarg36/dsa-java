import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name="sarthak";
        int age=20;
        int standard=12;
        System.out.println(name);
        System.out.print("hello\n");
        System.out.println(age);
        System.out.println(standard);
        int x=5;
        int y=6;
        System.out.println("the sum is " + x+y);
        System.out.println("the sum is " + (x+y));
        int length=5;
        int breadth=6;
        int area;
        area=length*breadth;
        System.out.println("the area is " + area);
       try( Scanner scn=new Scanner(System.in)){
        String name1=scn.nextLine();
        System.out.println("Hello, " + name1);
        int n=scn.nextInt();
        for (int i=1; i<n; i++){
            System.out.println(i);
        }
        scn.close();}
    }
}