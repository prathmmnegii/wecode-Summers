import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] nge = new int[n];

        // Stack me hum values store kar rahe hain
        Stack<Integer> st = new Stack<>();

        // 2*n-1 se 0 tak traverse karenge
        // Isse array ko circular bana dete hain
        for (int i = 2 * n - 1; i >= 0; i--) {

            // Actual index nikalne ke liye modulo use karte hain
            int idx = i % n;

            // Jo elements current element se chhote ya equal hain
            // wo kabhi Next Greater nahi ban sakte, isliye hata do
            while (!st.isEmpty() && st.peek() <= nums[idx]) {
                st.pop();
            }

            // Sirf original array (0 to n-1) ke liye answer fill karna hai
            // Pehle n iterations sirf stack prepare karne ke liye hain
            if (i < n) {

                // Agar stack khali hai to koi greater element nahi mila
                if (st.isEmpty()) {
                    nge[idx] = -1;
                } 
                // Warna stack ka top hi Next Greater Element hai
                else {
                    nge[idx] = st.peek();
                }
            }

            // Current element ko stack me daal do
            // Taaki ye left side ke elements ke liye candidate ban sake
            st.push(nums[idx]);
        }

        return nge;
    }
}