import java.util.*;
public class SashaandSticks {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        long n = sc.nextLong();
        long k = sc.nextLong();
        if(n>=k && n/k %2 == 1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}