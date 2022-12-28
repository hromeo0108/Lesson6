public class task2 {

    public static void main(String[] args) {
        //    Напечатать числа следующим образом:
        //    25 25.5 24.8
        //     26 26.5 25.8
        //    ...
        //    35 35.5 34.8

        for(int i = 24; i < 35; i++){
            System.out.printf("%d  %.1f  %.1f\n",i+1, i+1.5, i+0.8  );
        }

    }
}
