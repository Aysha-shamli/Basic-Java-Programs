import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number N: ");
        int N = scanner.nextInt();
        int power = 1;
        if(N<0 || N>30){
            System.out.println("Enter a number between 0 and 30");
        }else{
            for (int i = 0; i <= N; i++) {
                System.out.println("2^"+i+" is " + power  );
                power *= 2;
            }

        }
    }
}