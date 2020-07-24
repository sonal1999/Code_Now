import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         sc.nextLine();
        for(int i = 1 ; i <= n ; i++ ){
            String val[] = sc.nextLine().split(" ");
            int k = Integer.parseInt(val[0]);
           char c = val[1].charAt(0);
            printBoard(k , c);
        }
        sc.close();
    }
    
    static void printBoard(int k , char c){
        char d;
        if(c == 'W') d ='B';
        else  d = 'W';
        for(int i = 1 ; i <= k ; i++){
            for(int j = 1 ; j <= k ; j++){
                if(i%2 == 0 && j%2 == 0 ) System.out.print(c);
                else  if(i%2 == 0 && j%2 != 0 ) System.out.print(d);
                else  if(i%2 != 0 && j%2 == 0 ) System.out.print(d);
                else  if(i%2 != 0 && j%2 != 0 ) System.out.print(c);
            }
            System.out.println();
        }
    }
}