package module3;

import java.sql.SQLOutput;

public class homework3 {

    public static void main(String[] args) {
    unknownO(100);
    System.out.println("Counter: " + counter);
    }

    static int counter = 0;

    public static void unknownO(int n) {
        int i, j, k = 0;
        for (i = n / 2; i <= n; i++) {

            for (j = 2; j <= n; j = j * 2) {

                k = k + n / 2;
                //System.out.println(k);
                counter++;
            }
        }
    }
}