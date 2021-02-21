import java.util.*;
public class FafaAndHisCompany {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int i =1;
        int count = 0;
        while(i<n){
            if((n-i)%i==0){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }

}