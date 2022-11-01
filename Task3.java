import java.math.BigInteger;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("1000000000000") ;
        BigInteger n1 = new BigInteger("1") ;
        BigInteger ten = new BigInteger("10") ;
        Scanner s = new Scanner(System.in);
        BigInteger object = s.nextBigInteger();
        if (object.compareTo(n1)==0 | object.compareTo(n1)==1 | object.compareTo(n)==0 | object.compareTo(n1)==-1){
            int z = 0;
            while(object.mod(ten) == BigInteger.valueOf(0)){
                z++;
                object=object.divide(ten);

            }
            System.out.println(z);
        }


    }
    }

