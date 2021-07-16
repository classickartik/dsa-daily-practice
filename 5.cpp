Lemonade Change (https://leetcode.com/problems/lemonade-change/)

class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int five=0;
        int ten=0;
        
        for(int i=0;i<bills.size();i++){
           
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                if(five>0){
                    ten++;
                    five--;
                }
                else{
                    cout<<five<<" "<<ten<<" "<<endl;
                    cout<<i;
                    return false;
                }
                
            }
            else if(bills[i]==20){
                if(five>0 && ten>0){
                    
                    ten--;
                    five--;
                }
                else if(five>2){
                    five-=3;
                }
                else{
                    cout<<i;
                    cout<<five<<" "<<ten<<" "<<endl;
                    return false;
                }
            }
            
            
        }
        return true;
    }
};
