import java.util.Scanner;
class calculator
{
    public static void main(String ar[])
    {
        Double a,b,result;
        char op;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        a=sc.nextDouble();
        b=sc.nextDouble();
        System.out.println("select operator");
        System.out.println("+ for addition");
        System.out.println("- for substraction");
        System.out.println("* for multiplication");
        System.out.println("/ for division");
        op=sc.next().charAt(0);
        switch (op) {
            case '+':result=a+b;
                break;
            case '-':result=a-b;
                break;
            case '*':result=a*b;
                break;
            case '/':result=a/b;
                break;        
            default:System.out.println("enter valid operator");
                return;
        }
        System.out.println("result=" +result);
    }
}