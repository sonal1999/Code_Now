#include <iostream>
using namespace std;

int main() {
		long long n , j , i , sum;
		long long a[6];
		cin>>n;

		for(i = 0 ; i < n ;i++)
		{
            sum = 0 ;

		    for(j = 0 ; j < 6 ; j++)
		    {
		        cin>>a[j];
		    }

		    for(j = 0 ; j < 5 ; j++)
		    {
		        sum+=(a[j]*a[5]);
		    }

		    if(sum<=(120)){
		        cout<<"Yes";
		    }else{
		        cout<<"Yes";
		    }
		}
   return 0;
}
