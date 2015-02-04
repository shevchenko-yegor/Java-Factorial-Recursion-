/**
 * @author Yehor Shevchenko
 */

/**
 * This class gets a factorial of a number with recursion.
 */
public class Fact {
    
 /**
 * Class constructor
 */  
 public Fact() {
 }

   /** 
    * Finds factorial of n!.
    * @param n int value
    * @return the result of n!
    */
 public int fa(int n) {
     
     if(n == 1) { return 1;} 
     return n * fa(--n);
 }
     
}
