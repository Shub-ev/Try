package Assignment.A1;
import java.util.*;

public class Clocl_Angle {
    public static void main(String a []){
        System.out.println("Enter Clock Time (12 Hours) : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hour : ");
        int hour = sc.nextInt();
        System.out.println("Minutes : ");
        int min = sc.nextInt();

        int min_angle = min * 6;
        if(hour == 12){
            hour = 0;
        }

        int hour_angle = (min_angle / 12) + (hour * 30);
        System.out.println("The angle of Minute hand is : " + min_angle);
        System.out.println("The angle of Hour hand is : " + hour_angle);
        sc.close();
    }
}
