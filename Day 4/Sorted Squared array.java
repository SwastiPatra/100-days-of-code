class Solution {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int left =0;
        int right = A.length-1;
        for(int i =A.length-1;i>=0;i--){
            if(Math.abs(A[left])> A[right]){
                res[i]= A[left]*A[left];
                left++;
            }
            else{
                res[i]=A[right]*A[right];
                right--;
            }
        }
        return res;
    }
}
