import java.util.*;
public class Neko {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int chests_eve =0, chests_odd = 0, keys_eve=0, keys_odd = 0;
        int chests[] = new int[m] ;
        for (int i = 0; i < chests.length; i++) {
            chests[i]  = sc.nextInt();
            if(chests[i]%2==0){
                chests_eve ++;
            }
            else{
                chests_odd++;
            }
        }
        int keys[] = new int[n];

        for (int i = 0; i < keys.length; i++) {
            keys[i]= sc.nextInt();
            if(keys[i]% 2 == 0){
                keys_eve++;
            }
            else{
                keys_odd++;
            }
        }

        System.out.println((Math.min(chests_eve , keys_odd) + Math.min(chests_odd , keys_eve)));


        

    
    }
}
