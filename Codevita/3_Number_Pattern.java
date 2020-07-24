import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++ ){
            sc.nextLine();
            int t = sc.nextInt();
            printPattern(t);
        }
        sc.close();
    }
  static void printPattern(int t){
      for(int i = 1 ; i <= t ; i++){
          for(int j = 1 ; j <= i ; j++) System.out.print(j+" ");
          System.out.println();
      }
  }
    
}