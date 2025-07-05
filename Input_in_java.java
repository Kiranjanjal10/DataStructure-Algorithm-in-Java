import java.util.*;
public class Input_in_java {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            byte b= sc.nextByte();
             short s= sc.nextShort();
             int i=sc.nextInt();
             float f=sc.nextFloat();
             long l=sc.nextLong();
             double d=sc.nextDouble();
            char c=sc.next().charAt(0);
            boolean bool=sc.nextBoolean();
            String str=sc.next();
            String str1=sc.nextLine();

            System.out.println("Byte: "+b);
            System.out.println("Short: "+s);
            System.out.println("Integer: "+i);
            System.out.println("Float: "+f);
            System.out.println("Long: "+l);
            System.out.println("Double: "+d);
            System.out.println("Character: "+c);
            System.out.println("Boolean: "+bool);

            System.out.println("String: "+str);
            System.out.println("String: "+str1);
        }
        
    //     System.out.println("Your name is "+name);
    //     System.out.println("Your Roll No is "+no);
    //     System.out.println("Your Marks are "+marks);

        


    }

}
