import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = scanner.nextInt();

        String str=Integer.toString(year);
        if(str.length()==4){
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The "+year +" is Leap year");
            }else {
                System.out.println("The "+year +" is not a Leap year");
            }
        }else{
            System.out.println("Enter a 4 Digit Number");
        }
    }
}
