
import java.util.Scanner;

public class Task5 {
    static int fuctorial(int n) {
        return (n > 0) ? n * fuctorial(n - 1) : 1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        if (n >= 1 & n <= 10 & k >= 2 & k <= 1000){
            int a2;
            int i1=1;
            int sum=0;
            int res=0;
            String[] arr = new String[n];
            int a1 = 1;
            for (int i = 0; i < n; i++){

                String c1 =Integer.toString(a1);
                arr[i]= c1;
                a1++;
            }
        int count = fuctorial(arr.length);
        int max = arr.length - 1;
        int shift = max;
        String t;
        while (count > 0) {
            t = arr[shift];
            arr[shift] = arr[shift - 1];
            arr[shift - 1] = t;
            for (int i = 0; i < n; i++){

                a2 = Integer.parseInt(arr[i]);
                sum = sum +(a2 * i1);
                i1++;


            }
            if(sum%k==0){
                res=res+1;
            }
            i1 =1;
            sum=0;
            count--;
            if (shift < 2) {
                shift = max;
            } else {
                shift--;
            }
        }
            System.out.println(res);
    }
    }


}
