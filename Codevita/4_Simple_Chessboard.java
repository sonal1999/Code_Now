import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1 ; i <= n ; i++ ){
            sc.nextLine();
            int k = sc.nextInt();
            printBoard(k);
        }
        sc.close();
    }
    
    static void printBoard(int k){
        for(int i = 1 ; i <= k ; i++){
            for(int j = 1 ; j <= k ; j++){
                if(i%2 == 0 && j%2 == 0 ) System.out.print("W");
                else  if(i%2 == 0 && j%2 != 0 ) System.out.print("B");
                else  if(i%2 != 0 && j%2 == 0 ) System.out.print("B");
                else  if(i%2 != 0 && j%2 != 0 ) System.out.print("W");
            }
            System.out.println();
        }
    }
}