import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.min;

public class Task4 {
    public static void main(String[] args){
        String str;
        str = new String("abcdefghijklmnopqrstuvwxyz");
        Scanner s;
        s = new Scanner(System.in);
        int N = s.nextInt();
        if (!(N >= 1 & N <= 100)) {
            return;
        }
        char[][] mas = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j >= 0; j--) {
                var k = min(abs(i - j), abs(i + j - N + 1));
                mas[i][j] = str.charAt(k % 26);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mas[i][j]);
            }
            System.out.println();
        }

    }
}
