import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int N = s.nextInt();
        if (0 <= A & B<=10000 & N>=1 & N<=10000){
            var minB = B/N;
            if(A>minB)
                System.out.println("Yes");
            if(A == minB)
                System.out.println("No");
            if(A<minB)
                System.out.println("No");
        }

    }
}
