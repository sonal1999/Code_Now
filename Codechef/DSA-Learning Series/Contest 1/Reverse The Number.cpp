#include <iostream>
using namespace std;

int main() {
	// your code goes here
	
	int num,rev=0,n;
	cin>>n;

	while(n>0){
	  cin>>num;
	  rev =0;
	  while(num!=0){
	      rev = ((rev*10) +(num%10));
	      num = num /10;
	  }
	  cout<<rev<<endl;
	 n--;   
	}
	return 0;
}
