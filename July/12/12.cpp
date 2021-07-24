#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int a[3];
        int b[3];
        for(int i=0;i<3;i++){
            cin>>a[i];
        }
        for(int i=0;i<3;i++){
            cin>>b[i];
        }
        int sa=0;
        int sb=0;
        for(int i=0;i<3;i++){
            if(a[i]>b[i]){
                sa++;
            }
            else if(b[i]>a[i]){
                sb++;
            }
        }
        if(sa>sb){
            cout<<'A'<<endl;
        }
        else{
            cout<<'B'<<endl;
        }
    }

    return 0;
}
