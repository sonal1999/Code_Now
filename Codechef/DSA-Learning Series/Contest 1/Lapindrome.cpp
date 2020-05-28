#include <iostream>
#include<bits/stdc++.h>
#define l1 long long
using namespace std;

int main() {
    l1 n ,input;
    cin>>n;
    
    vector<l1> c1;
    c1.clear();
    
    for(l1 i = 0 ; i < n ; i++ ){
        cin>>input;
        c1.push_back(input);
    }
    
    sort(c1.begin(),c1.end());
    
    
    l1 amount = 0;
    l1 revenue = 0;
    for(l1 i = 0 ; i < n ; i++ ){
          amount = 0;
          amount = c1[i]*(n-i);
          if(amount >  revenue)
             revenue = amount;
    }
    
    cout<<revenue<<endl;
	return 0;
}
