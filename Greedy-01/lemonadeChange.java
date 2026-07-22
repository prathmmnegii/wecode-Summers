 /*
class Solution {
    public boolean lemonadeChange(int[] bills) {

        return helper(bills, 0, 0, 0);
        
    }

    boolean helper(int[] bills, int index, int five, int ten){
        if(index==bills.length) return true;

        int currentBill= bills[index];  //current bill ko store kiya
        if(currentBill==5){  // jab bill 5 hai
            return helper(bills, index+1, five+1, ten); // 5 ka count badaya and recursion for next index
        }
        else if(currentBill==10){ //jab bill 10 hai
            if(five>=1){  //hampe ek 5 available hai
                return helper(bills, index+1, five-1, ten+1); //five ghataya and ten badaya and recursion for next
            }
            else return false; // no change of 5 available, return false
        }
        else{  //jab bill 20 hai
            if(ten>=1 && five>=1){  // humpe ek 10 ka or ek 5 ka change available hai
                return helper(bills, index+1, five-1, ten-1); //dono ek ek minus kre or recursion for next
            }
            else if(five>=3){  // ya fir humpe teen 5 availabe hai
                return helper(bills, index+1, five-3, ten);
            }
            return false;  // no change available
        }
    }
}
*/
class Solution {
    public boolean lemonadeChange(int[] bills) {

        int five=0; 
        int ten=0; 

        for(int bill : bills){
            if(bill==5){
                five++;

            }
            else if(bill==10){
                if(five>=1){
                    five--;
                    ten++;
                }
                else return false;
                
            }
            else{
                if(five>=1 && ten>=1){
                    five--;
                    ten--;
                }
                else if(five>=3){
                    five-=3;
                }
                else return false;
            }
        }
        return true;



    }
} 
    

