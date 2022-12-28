public class task3 {
    public static void main(String[] args) {
//        Напечатать таблицу соответствия между весом в фунтах и весом в килограммах
//        для значений 1, 2, ..., 10 фунтов (1 фунт = 453 г).
        int c = 10;
        int lb = 1;
        double kg = 0.453;
        for(int i = lb; i <= c; i++){
            kg = lb * 0.453;
            System.out.printf("%d lb =  %.3f kg\n",lb,kg);
            lb++;
        }
    }

}
