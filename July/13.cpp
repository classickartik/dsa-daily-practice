#include <bits/stdc++.h>
using namespace std;

int main(){
  int t;
  cin>>t;
  while(t--){
    int x;
    int y;
    cin>>x>>y;
    float ans;
    if(x+y>6){
      cout<<0<<endl;
    }
    else{
      ans=(float)(6-x-y)/6;
      cout<<ans<<endl;
    }
  }
  return 0;
}
