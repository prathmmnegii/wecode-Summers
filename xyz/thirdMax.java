class Solution {
    public int thirdMax(int[] nums) {

        // Array ko ascending order me sort kar do
        Arrays.sort(nums);

        int distinct = 1;                     // Abhi tak 1 distinct maximum mila hai
        int prev = nums[nums.length - 1];     // Sabse bada element

        // End se traverse karenge kyunki hume maximums chahiye
        for (int i = nums.length - 2; i >= 0; i--) {

            // Agar naya distinct element mila
            if (nums[i] != prev) {
                distinct++;
                prev = nums[i];
            }

            // Jaise hi 3rd distinct maximum mile, return kar do
            if (distinct == 3) {
                return nums[i];
            }
        }

        // Agar 3 distinct elements hi nahi hain,
        // to maximum element return karna hai
        return nums[nums.length - 1];
    }
}