import java.util.Scanner;

public class SwitchStmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day no of Week :");
        int dayn = sc.nextInt();
        String day;
        switch (dayn) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid Day Choice ";
                break;
        }
        System.out.println("Day:" + day);
        sc.close();
    }
}
