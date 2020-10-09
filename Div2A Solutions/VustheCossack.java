
import java.util.*;
public class VustheCossack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();

        if(m>=n && p>=n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
