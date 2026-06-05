public class linearSearch {
    static int linear(int[] arr, int target, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]== target) return i;

         return linear(arr, target, i+1);

    }
    
}
