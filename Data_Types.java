public class Data_Types {
    public static void main(String[] args) {
        
        byte b = 127; // 1 byte
        short s = 32767; // 2 bytes
        char c='A'; // 2 bytes (Unicode character)
        boolean B=true; // 1 bit (not precisely defined in Java, but typically 1 byte)
        int i=123; // 4 bytes
        long l=(long) 3.44556677; // 8 bytes

        float f=3.14f; // 4 bytes
        double d=3.14; // 8 bytes
        String str="Hello World"; // 2 bytes per character
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + B);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("String: " + str);
    }
}
