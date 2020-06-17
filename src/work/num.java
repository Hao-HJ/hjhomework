package work;

public class num {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i++) {
            boolean a = false;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    a = true;
                    break;
                }
            }
            if (!a) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
