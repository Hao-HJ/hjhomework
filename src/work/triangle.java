package work;

public class triangle {
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++) {    //输出6行
            for (int j = 0; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
