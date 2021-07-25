//Brute force solution is to 1st find the squares of every number as given in the sorted array. 
//Then we can store the squares in another array and then can sort them afterwards using sort() method.
//This will have a time complexity of O(N log N).


//O(N) complexity -----> Optimised solution

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
