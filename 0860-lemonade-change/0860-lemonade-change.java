class Solution {
    public boolean lemonadeChange(int[] bills) {
        int sum5 = 0;
        int sum10 = 0;
        int sum20 = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                sum5++;
            } 
            else if (bills[i] == 10) {
                if (sum5 > 0) {
                    sum5--;
                    sum10++;
                }
                else {
                    return false;
                }
                } 
                else if (bills[i] == 20) {
                    if (sum5 > 0 && sum10 > 0) {
                        sum20++;
                        sum5--;
                        sum10--;
                    }
                     else if (sum5 >= 3) { 
                    sum20++; 
                    sum5 -= 3;
                }
                 else{
                    return false;
                }   
                }
               
        }

        return true;
    }
}