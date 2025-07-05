import java.util.*;
public class CostOfItems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Cost of pencile :");
        float pencileCost=sc.nextFloat();
        System.out.println("Enter the Quantity of Pencile :");
        int pencileQuantity=sc.nextInt();
        System.out.println("Enter the Cost of Pen :");
        Float penCost =sc.nextFloat();
        System.out.println("Enter the Quantity of Pen :");
        int penQuantity =sc.nextInt();
        System.out.println("Enter the Cost of Eraser :");
        Float EraserCost =sc.nextFloat();
        System.out.println("Enter the Quantity of the Eraser :");
        int EraserQuantity=sc.nextInt();

        float pencilePrice=(pencileCost*pencileQuantity);
        float penPrice=(penCost*penQuantity);
        float EraserPrice=(EraserCost*EraserQuantity);
        Float finalPrice=(penPrice+pencilePrice+EraserPrice);
        System.out.println("Final Bill of Customer with pens ("+penQuantity+") & Pencile("+pencileQuantity+")  & Eraser ("+EraserQuantity+"): "+finalPrice);
        float GSTPrice =(float) (finalPrice+(finalPrice *0.18));
        System.out.println("Bill Amount with 18% GST :"+GSTPrice);
       int $=34;

        
    }
}
