import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number :");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number :");
        int num3 = sc.nextInt();

        int[] array = {num1,num2,num3};
        int max = num1;
        for (int i:array){
            if (i > max){
                max = i;
            }
        }
        System.out.println("Largest number is: "+max);
    }
}
