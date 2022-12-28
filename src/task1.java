import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
//        Составить программу вывода любого числа любое заданное число раз.

        Scanner sc = new Scanner(System.in);
        System.out.println("введите число:");
        int a = sc.nextInt();

        Random rand = new Random();
        int upperbound = 1000;
        int int_random = rand.nextInt(upperbound);

        for (int i = 0; i <= a; i++) {
            System.out.println(int_random);
        }
    }

}
