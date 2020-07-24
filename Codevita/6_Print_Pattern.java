import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int count = 1;
        for(int i = 1 ; i <= n ; i++){
            sc.nextLine();
            int k = sc.nextInt();
            printPattern(k ,count++);
        }
       
        sc.close();
    }
    
    static void printPattern(int k , int count){
        int start = 0;
        System.out.println("Case #"+count);
        for(int i = k ; i >= 1 ; i--){
            int reverse = 0;
            for(int j = 1 ; j <= (2*(k-i)) ; j++) System.out.print("*");  //Space
            for(int p = 1 ; p <= i ; p++) {                               //Print Number
                 start++;
                 System.out.print(start+"0");
            }
            for(int l = i-1 ; l >= 1 ; l--){                      //calculate reverse
                reverse += l;
             }
            reverse = (reverse * 2);
            reverse += start;
            for(int m = 1 ; m <= i ; m++ ) {
                reverse++;
                if(m == i) System.out.print(reverse);
                else System.out.print(reverse+"0");
            }
            System.out.println();
        }
    }
}
