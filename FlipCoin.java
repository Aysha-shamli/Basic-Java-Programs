import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to flip the coin: ");
        int num = scanner.nextInt();

        if (num > 0) {
            int heads = 0;
            int tails = 0;

            for (int i = 0; i < num; i++) {
                double random = Math.random() ;
                if (random < 0.5) {
                    heads++;
                } else {
                    tails++;
                }
            }
            double percentageHeads = (double) heads / num * 100;
            double percentageTails = (double) tails / num * 100;
            System.out.println("Percentage of heads: " + percentageHeads + "%");
            System.out.println("Percentage of tails: " + percentageTails + "%");
        }
        else {
            System.out.println("Please enter a positive integer");
        }
    }
}

