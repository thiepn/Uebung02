package h2;

public class H2_main {
    public static void main(String[] args) {
        int i = 1;
        int j = 20;
        int k = 300;
        int min;
        int max;

        if (i < j && i < k) {
            min = i;
        } else if (j < k && j < i) {
            min = j;
        } else {
            min = k;
        }

        if (i > j && i > k) {
            max = i;
        } else if (j > k && j > i) {
            max = j;
        } else {
            max = k;
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);


    }
}
