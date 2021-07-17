class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        int count=0;
        sort(s.begin(),s.end());
        sort(g.begin(),g.end());
        reverse(s.begin(),s.end());
        reverse(g.begin(),g.end());
        int i=0;
        int j=0;
        for(auto itr: s){
            cout<<s[i];
            i++;
        }
        cout<<endl;
        for(auto itr: g){
            cout<<g[j];
            j++;
        }
        cout<<endl;
        i=0;
        j=0;
        while(i<s.size() && j<g.size()){
                if(s[i]>=g[j]){
                    count++;
                    i++;
                }
                j++;
            
        }
        return count;
    }
};
