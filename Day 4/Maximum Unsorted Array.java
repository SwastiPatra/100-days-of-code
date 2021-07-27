public class Solution {
    public int[] subUnsort(int[] A) {
        int start=-1;
        int n=A.length;
        int max=0; 
        for(int i=0; i<n-1; i++){
            if(A[i]>A[i+1]){
                start=i;
                break;
            }
        }
        if(start==-1)return new int[]{-1};
        int min=Integer.MAX_VALUE;
        for(int i=start; i<n; i++){
            min=Math.min(min,A[i]);
        }
        for(int i=0; i<start; i++){
            if(A[i]>min){
                start=i;
                break;
            }
        }
        int end=start+1;
        for(int i=n-2; i>start; i--){
            if(A[i]>A[i+1]){// || A[i+1]<max){
                end=i+1;
                break;
            }
        }   
        for(int i=end; i>=start; i--){
            max=Math.max(max,A[i]);
        }
        for(int i=n-1; i>end; i--){
            if(A[i]<max){
                end=i;
                break;
            }
        }   
        return new int[]{start,end};   
    }
}
