class Solution {
public:
    int minCostToMoveChips(vector<int>& p) {
        sort(p.begin(),p.end());
        int arr[2]={0};
        for(int i=0;i<p.size();i++){
            if(p[i]%2==0){
                arr[0]++;
            }
            else{
                arr[1]++;
            }
        }
        int cost=0;
        cost=min(arr[0],arr[1]);
        return cost;
    }
};
