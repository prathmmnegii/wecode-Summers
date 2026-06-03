class reverseArray{
    static void swap(int[] arr, int i, int j ){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }

    static void reverse(int i, int[] arr, int n){
        if(i>=n/2){
            return;
        }
        swap(arr, i, n-i-1);
        reverse(i+1, arr, n);

    }
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        reverse(0, arr, arr.length);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }

}