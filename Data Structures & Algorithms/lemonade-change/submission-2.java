class Solution {
    public boolean lemonadeChange(int[] bills) {
        int change5 = 0;
        int change10 = 0;
        int change20 = 0;
        for(int e : bills){
            if(e == 5){
                change5++;
            }
            else{
                int diff = e-5;
                if(diff == 5){
                    change10++;
                    if(change5 > 0){
                        change5--;
                    }
                    else{
                        return false;
                    }
                }
                else if(diff == 15){
                    change20++;
                    if(change5 > 0 && change10 > 0){
                        change5--;
                        change10--;
                    }
                    else if(change5 >= 3 && change10 == 0){
                        change5 -= 3;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}