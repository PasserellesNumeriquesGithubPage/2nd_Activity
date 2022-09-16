<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the first number: ");
        num1 = inp.nextInt();
        System.out.println("Enter second number: ");
        num2 = inp.nextInt();
        int ans;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println("The result is: "+ add( num1,num2));
            break;
        case 2:
            System.out.println("The result is: "+ sub( num1,num2));
            break;      
        case 3:
            System.out.println("The result is: "+ mult( num1,num2));
            break;
        case 4:
            System.out.println("The result is: "+ div( num1,num2));
            break;
            default:
                System.out.println("Illigal Operation");
        }
	}
}
=======
public class Main {
    public static int add(int x, int y){
        int result = x + y;
        return result;
    }
}
>>>>>>> feature/Addition
=======
public class Main {
    public static int sub(int x, int y){
        int result = x-y;
        return result;
    }
}
>>>>>>> feature/Subtraction
=======
public class Main {
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
}
>>>>>>> feature/Multiplication
