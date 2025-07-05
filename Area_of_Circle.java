import java.util.*;
public class Area_of_Circle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float rad=sc.nextFloat();
             float area=3.14f*rad*rad;
             System.out.println("Area of a Circle :"+area);
        }
    }
}
