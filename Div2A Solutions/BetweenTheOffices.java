import java.util.*;
public class BetweenTheOffices {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(str.charAt(0)== 'S' && str.charAt(str.length()-1)=='F'?"YES":"NO");
    }
    
}