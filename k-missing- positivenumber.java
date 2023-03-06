class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int l = 0;
        int r = n-1;
        int miss = compute(arr[n-1],n);
        while(l<=r){
            int mid = l + (r-l)/2;
            miss = compute(arr[mid],mid+1);

            if(miss >= k) r = mid-1;
            else l = mid+1;
        }
        if(r == -1) return k;
        return arr[r]  + k - compute(arr[r],r+1);
    }
    int compute(int actual , int expected){
    return actual - expected;
    }
}
