public class Solution {
    public int[] plusOne(int[] A) {
        if(A.length == 1) {
            if(A[0] == 9) return new int[]{1, 0};
            return new int[]{A[0]+1};
        }
        int n = A.length;
        int i;
        for(i = 0; i < n; i++) {
            if(A[i] != 0) break;
        }
        int start = i;
        boolean allNine = true;
        for(i = start; i < n; i++) {
            if(A[i] != 9) {
                allNine = false;
                break;
            }
        }
        if(allNine) {
            int ans[] = new int[n+1];
            ans[0] = 1;
            return ans;
        }
        int ans[] = new int[n-start];
        int carry = 1;
        for(i = n-1; i >= start; i--) {
            if(A[i] + carry > 9) {
                ans[i-start] = 0;
            }
            else {
                ans[i-start] = A[i]+carry;
                break;
            }
        }
        while(--i >= start) {
            ans[i-start] = A[i];
        }
        return ans;
    }
}
