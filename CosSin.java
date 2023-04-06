import java.lang.Math;
  
class CosSin {
  
    // driver code
    public static void main(String args[])
    {
        double a = 30;
          
        // converting values to radians
        double b = Math.toRadians(a);
  
        System.out.println(Math.cos(b));
  
        a = 45;
          
        // converting values to radians
        b = Math.toRadians(a);
  
        System.out.println(Math.cos(b));
  
        a = 60;
          
        // converting values to radians
        b = Math.toRadians(a);
  
        System.out.println(Math.cos(b));
  
        a = 0;
          
        // converting values to radians
        b = Math.toRadians(a);
  
        System.out.println(Math.cos(b));
    }
}