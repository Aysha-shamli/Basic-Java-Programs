import java.util.Scanner;
public class Computation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int a = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int b = scanner.nextInt();
        int Quotient = a/b;
        int Reminder = a%b;
        System.out.println("The Quotient of " +a+"/"+b +" is :"+Quotient);
        System.out.println("The Reminder of " +a+"/"+b +" is :"+Reminder);

    }
}
