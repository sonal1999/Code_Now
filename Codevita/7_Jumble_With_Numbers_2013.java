import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int flag = 0;
        
        if( t1 <= 0 && t2 <= 0) System.out.println("Invalid Input");
        else {
              for(int i = 1 ; ; i+=2){
                    int val = (i*(i+1) / 2) ;
                    if(val > t1 && val < t2){
                        count++;
                        if(count == m){
                           System.out.println(val);
                           flag = 1;
                           break;
                     }
                   }
                   if(val >= t2) break;
              }
             if(flag == 0) System.out.println("No number is present at this index");
        }
        sc.close();
    }
}