class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> mp= new HashMap<>();
        Stack<Integer> st= new Stack<>();

        for(int i=nums2.length-1; i>=0; i--){

            int curr= nums2[i];  //current value ko save krlia

            while(!st.isEmpty() && st.peek() <= nums2[i]){  //agar top ki value curr se choti hai pop
                st.pop();
            }

            if(st.isEmpty()){  //stack empty hogya hai to -1 daldo
                mp.put(curr,-1);
            }
            else{
                mp.put(curr, st.peek());  //othetrwise top ki value(curr ka NGE)
            }
            st.push(nums2[i]);  // stack mai curr dalte raho
        }

        int[] ans= new int[nums1.length];  //naya array banao 
        for(int i=0; i<nums1.length; i++){   //traverse karo
            ans[i]=mp.get(nums1[i]); //map se value uthate raho or put krte raho
        }

        return ans; //return final ans
        
    }
}