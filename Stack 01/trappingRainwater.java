class Solution {
    public int trap(int[] height) {

        int n= height.length;

        int left=0;   //left pointer
        int right= n-1; //right pointer

        int leftMax=0;  //initial left max
        int rightMax=0; //initial right max

        int total=0;  //total amount of rainwater(ans)

        while(left<right){

            if(height[left]<=height[right]){  //agar leftmax chhota hai
                if(height[left]< leftMax){  //current ele chota hai leftmax se
                    total+= leftMax-height[left];  // to total ki value leftmax- current ele ki height
                }

                else{
                    leftMax=height[left]; //agar current ele ki height badi hai leftmax se to leftmax change krdo
                }

                left++;  //leftmax ko aage badhao
            }

            else{
                if(height[right]< rightMax){
                    total+=rightMax-height[right];
                }
                else{
                    rightMax=height[right];
                }

                right--;
            }
        }

        return total;  //total return krdo
        
    }
}