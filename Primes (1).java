import java.util.*;

public class Primes {
	void printPrimes(){
      
      int nValues =50;
      outerloop:for(int i = 2; i <= nValues; i++)
      {
        int maxDivisor = (int) Math.ceil(Math.sqrt(i));
        for (int j = 2; j<= maxDivisor; j++)
        {
           if (i%j == 0)
           {
           continue outerloop;
           }
        }
      System.out.println(i);
     }
}
}


      
  
