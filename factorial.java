// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

class factorial {
   factorial() {
   }

   public static void main(String[] var0) {
      int var3 = 1;
      Scanner var4 = new Scanner(System.in);
      System.out.println("Enter a number:");
      int var1 = var4.nextInt();

      for(int var2 = 1; var2 <= var1; ++var2) {
         var3 *= var2;
      }

      System.out.println("Factorial = " + var3);
   }
}
