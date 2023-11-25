package Assignment.A1;
import java.util.*;

public class Binary_Decimal_Binary {
    public static void main(String a []){
        System.out.println("Enter the Process : \n1.Binary to Decimal\n2.Decimal to Binary");
        Scanner sc = new Scanner(System.in);
        int pro = sc.nextInt();
        if(pro == 1){
            System.out.println("Processing Binary to Decimal....");
            System.out.println("Enter Binary Number : ");
            sc.nextLine();
            int Binary = sc.nextInt();
            int power = 0, Decimal = 0;
            while(Binary != 0){
                if(Binary % 10 == 1){
                    Decimal += Math.pow(2, power);
                    power++;
                }
                else{
                    power++;
                }
                Binary = Binary / 10;
            }
            System.out.println("The Decimal Number is : " + Decimal);
        }
        else if(pro == 2){
            System.out.println("Processing Decimal to Binary....");
            System.out.println("Enter Decimal Number : ");
            sc.nextLine();
            String Binary = "";
            int Decimal = sc.nextInt();
            while(Decimal != 0){
                Binary += (Decimal % 2);
                Decimal = Decimal / 2;
            }
            System.out.println("Binary Number : ");
            for(int i= Binary.length()-1; i > -1; i--){
                System.out.print(Binary.charAt(i));
            }
        }
        else{
            System.out.println("Invalid Option.");
        }
        System.out.println("\nProcess End.");
        sc.close();
    }
}
