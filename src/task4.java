import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
//        Вычислить сумму 1+1/2+1/3+...+1/n.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввидите число до корого прибавлять:");

        int number = sc.nextInt();
        int sum = 0;
        int one = 1;

        for( int i = 1; i <=number; i++){
        sum = i + one;
            System.out.printf("%d+%d=%d\n",i,one,sum);
        }

    }
}
