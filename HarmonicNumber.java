
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number N: ");
        int N = scanner.nextInt();
        double harmonicValue = 0;

        if(N<=0){
            System.out.println("Enter a positive number");
        }else {
            for (int i = 1; i <= N; i++) {
                harmonicValue += (1.0 / i);
            }
            System.out.println(N + "th harmonic value is: " + harmonicValue);
        }

    }
}