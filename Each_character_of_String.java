package Assignment.A1;
import java.util.*;

public class Each_character_of_String {
    public static void main(String a []){
        System.out.println("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
        sc.close();
    }   
}
