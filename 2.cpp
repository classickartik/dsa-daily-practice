Can Place Flowers (https://leetcode.com/problems/can-place-flowers/)

class Solution {
public:
    bool canPlaceFlowers(vector<int>& f, int n) {
        int count=0;
        int i=0;
        while(i<f.size()){
            if(f[i]==0){
                int prev = (i==0 || f[i-1]==0) ? 0:1;
                int next = (i==f.size()-1 || f[i+1]==0) ? 0:1;
                if(prev==0 && next==0){
                    count++;
                    f[i]=1;
                }
            }
            i++;
        }
        if(count>=n){
            return true;
        }
        else{
            return false;
        }
    }
};
