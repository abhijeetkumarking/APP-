import java.util.*;
public class sumofNnumbers {
    public static void main (String []args){
        Scanner sc = new scanner();
        int sum = 0;
        int n = sc.nextInt(System.in);
        for(int i = 0; i<= n; i++){
            sum += i;
        }
        System.out.println("sum of n numbers : " +sum);   
    }
}