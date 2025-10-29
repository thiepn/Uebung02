package h3;

public class H3_main {
    public static void main(String[] args) {
        int i = 1;
        int j = 1000;
        int k = -10;

        if (i > j && i <= 200 && j <= 100) {
            k = 1;
        } else if (i > j && i > 200 && j <= 100) {
            k = 2;
        } else if (i > j && i > 200 && j > 100) {
            k = 3;
        } else if (i < j && i <= 200 && j <= 100) {
            k = 4;
        }
        System.out.println(k);
    }
}
