class Solution {
public:
    void merge(vector<int>& num1, int m, vector<int>& num2, int n) {
        while(n>0){
            if(m==0){
                num1[n+m-1]=num2[n-1];
                n--;
                continue;
            }
            if(num1[m-1]>num2[n-1]){
                num1[m+n-1]=num1[m-1];
                m--;
                cout<<"m"<<m<<endl;
            }
            else{
                num1[n+m-1]=num2[n-1];
                n--;
                cout<<"n"<<n<<endl;
            }
        }
    }
};
