import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            sc.nextLine();
            int k = sc.nextInt();
            int count = 1;
            
            for(int j = 1 ; j <= k ; j++){
                for(int m = 1 ; m <= ((k-j)*3);m++){
                    System.out.print(" ");
                }
                for(int l = 1; l <= j ; l++){
                   // System.out.print(" ");
                    System.out.print(String.format("%05d",element(count))+" ");
                    count++;
                }
                System.out.println();
            }  
        }
             
    }
    
    static int element(int count){
        
        int first = 6;
        int second = 28;
        if(count == 1) return first;
        if(count == 2) return second;
        int next= 0;
        for(int i = 3 ; i <= count ; i++){
            next = (second * 2) - first + 16;
            first = second;
            second = next;
        }
       return next;  
    }
}