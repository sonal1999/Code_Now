import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1 ; i <= n ; i++){
            sc.nextLine();
            int k = sc.nextInt();
            
            if(k <= 1)  System.out.println("You cannot generate christmas tree");
            else if( k > 20)  System.out.println("Tree is no more"); 
            else{                         
            printFullTriangel(k+1);
            printPartialTriangel(k);
            printStand(k);
            } 
        }
    }
    
    static void printFullTriangel(int k){
        for(int i = 1 ; i <= k ; i++){
            for(int n=1 ; n <= (k-i) ; n++)  System.out.print(" ");
            for(int m=1 ; m <= ((2*i)- 1) ; m++) System.out.print("*");
            System.out.println();
          }
   }
    static void printPartialTriangel(int k){
        int offset = 1;
        for(int i = k-1 ; i >=2 ; i--){
            partial(i , offset);
            offset++;
          }
   }
    static void partial(int k, int offset){
        for(int i = 1 ; i <= k ; i++){
            for(int m=1 ; m <= offset ; m++)  System.out.print(" ");
            for(int n=1 ; n <= (k-i) ; n++)  System.out.print(" ");
            for(int p=1 ; p <= ((2*i)+ 1) ; p++) System.out.print("*");
            System.out.println();
          }
   }
   static void printStand(int k){
        for(int i = 1 ; i <= 2 ; i++){
            for(int j = 1 ; j <= k ; j++) System.out.print(" ");
            System.out.print("*");
            System.out.println();
        }      
   }    
}