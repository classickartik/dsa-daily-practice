class Solution {
public:
    long long int maxArea(vector<int>& h) {
        int maxarea=0;
        int l=0;
        int r=h.size()-1;
        while(l<r){
            int height=min(h[l],h[r]);
            int width=max(r,l)-min(r,l);
            int area=height*width;
            maxarea=max(maxarea,area);
            if(h[l]<h[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxarea;
    }
};
