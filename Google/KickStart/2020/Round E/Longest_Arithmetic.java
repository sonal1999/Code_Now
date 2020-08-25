import java.util.*;
public class Longest_Arithmetic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for(int check = 1 ; check <= T ; check++){
            int N = Integer.parseInt(sc.nextLine());

            int arr[] = new int[N];
            for(int i=0 ; i < N ; i++)
                arr[i]=Integer.parseInt(sc.next());

            int temp_count = 0;
            int perm_count = 0;

            int i = 0 , j = 0;

            for(i = 0 ; i < N-1 ; ){
                temp_count = 0;
                int diff = Math.abs(arr[i] - arr[i+1]);
                temp_count++;
                for(j=i+1 ; j < N-1 ; j++){
                    if(Math.abs(arr[j] - arr[j+1]) == diff)
                        temp_count++;
                    else
                        break;
                }
                i=j;
           //     System.out.println(temp_count);
                if(temp_count > perm_count)
                    perm_count = temp_count;
            }
            System.out.println("Case #"+T+": "+(perm_count+1));
        }
    }
}
