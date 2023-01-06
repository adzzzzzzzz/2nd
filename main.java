import java.util.*;

import java.math.*;

  class Main {

  public static void main(String[] args) {

    Scanner a = new Scanner(System.in);

    int b = a.nextInt();

    a.close();

    BigInteger o;

    BigInteger k = new BigInteger("1");

    BigInteger m = new BigInteger("1");

    for(int i=2;i<=b;i++)

      {

       o=k.add(m);

       k=m;

       m=o;  

      }

    BigInteger p = new BigInteger("10");

    BigInteger y = k.mod(p);

    System.out.printf("%d", y);  

  }

}
