import java.util.Scanner; 
import java.lang.Math; 

public class Bhaskara { 
public static void main (String[] args) {
    Scanner scan = new Scanner(System.in); 
    double a, b, c, d, r1, r2; 
    
    System.out.println("digite o a" ); 
    a = scan.nextDouble();
    
    System.out.println("digite o b" );
    b = scan.nextDouble();
    
    System.out.println("digite o c" );
    c = scan.nextDouble(); 
    
    
    d = (b * b) - 4 * a * c; 
    if (d >= 0) {
    
    r1 = ((-1 * b) + Math.sqrt(d)) / (2 * a);  
    r2 = ((-1 * b) - Math.sqrt(d)) / (2 * a); 
    System.out.println("resultado 1 = " +r1);
    System.out.println("resultado 2 = " +r2); 
    
    } else { 
      System.out.println("delta não possui raiz.");
    } 
   }  
}