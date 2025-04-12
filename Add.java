import java.util.*;

public class Add {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers to add ");
        int a, b,c;
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println("Addition of two integers " + c);
    }
}
