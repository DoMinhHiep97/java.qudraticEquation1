import java.util.Scanner;

public class QuadraticEquation1 {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a=");
        double a = scanner.nextDouble();
        System.out.println("b=");
        double b = scanner.nextDouble();
        if (a == 0) {
            if(b==0){
                System.out.println("Equation always right!");
            }else{
                System.out.println("Equation not exist!");
            }

        }else {
            double solution=-b/a;
            System.out.println("The solution is:"+solution);
        }

    }
}
