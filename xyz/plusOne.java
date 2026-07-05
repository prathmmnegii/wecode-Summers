class Solution {
    public int[] plusOne(int[] digits) {

        for (int i=digits.length-1; i>=0; i--){
            if(digits[i]==9){  //pehla case last digit 9 hai
                digits[i]=0;
            } else{            // dusra case: last digit 9 nahi hai 
                digits[i]++;
                return digits;

            }
        }

        //if all 9;

        int[] all9= new int[digits.length+1];
        all9[0]=1;  //naye array ka first element 1 set krdo (baali elements to by-default 0 hi hote hai)
        return all9;

        
    }
}