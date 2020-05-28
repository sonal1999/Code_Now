#include <iostream>
#include <bits/stdc++.h> 
using namespace std;

int main() {
	// your code goes here
	char str[1002];
	int count[26];
	int t;
	cin>>t;
	for(;t>0;t--)
	{
	    cin>>str;
	    int len = strlen(str);
	    memset(count,0,sizeof(count));
	    for(int i=0, j=len-1 ; i < j ; i++ , j-- ){
	        count[str[i] - 'a']++;
	        count[str[j] - 'a']--;
	    }
	    
	    bool ok = true;
	    
	    for(int i =0 ; i < 26; i++){
	        if(count[i] != 0 ){
	            ok = false;
	            break;
	        }
	    }
	   puts(ok ? "YES" : "NO");
	}
	return 0;
}
