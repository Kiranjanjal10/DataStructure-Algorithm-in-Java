import java.util.*;
public class ArethmeticBinaryOperator {

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the First Number :");
      int var2 = var1.nextInt();
      System.out.println("Enter the Second Number :");
      int var3 = var1.nextInt();
      System.out.println("Addition :" + (var2 + var3));
      System.out.println("Subtraction :" + (var2 - var3));
      System.out.println("Multiplication:" + var2 * var3);
      System.out.println("Division:" + var2 / var3);
      System.out.println("Mudulo :" + var2 % var3);
   }
}