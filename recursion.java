public class recursion {
  public static void main(String[] args) {
        double x = 2.5;
        int n = 3;
        double result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
   

   }
    
    public static double power(double x, int n)
    {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return x * power(x, n - 1);
        } else {
            // Negative power
            return 1 / power(x, -n);
        }
    }
  }

    
    
  

    
