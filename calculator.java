import java.util.*;

public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. : ");
        float a = sc.nextFloat();

        System.out.print("Enter a operator : ");
        String op = sc.next();

        System.out.print("Enter 2nd no. : ");
        float b = sc.nextFloat();

        switch(op){

            case "+" : System.out.println(a + b);
            break;

            case "-" : System.out.println(a-b);
            break;

            case "*" : System.out.println(a*b);
            break;

            case "/" : System.out.println(a/b);
            break;

            case "%" : System.out.println(a%b);
            break;

            default : System.out.println("Invalid operator");
        }


    }
    
}
