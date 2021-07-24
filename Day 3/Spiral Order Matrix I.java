public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int rowBegin = 0;
        int rowend = A.size()-1;
        int columnBegin = 0;
        int columnEnd = A.get(0).size()-1;

        while(rowBegin<=rowend && columnBegin<=columnEnd){
            for(int i = columnBegin; i<= columnEnd; i++){
                ans.add(A.get(rowBegin).get(i));
            }
            rowBegin ++;
            for(int i=rowBegin;i<=rowend;i++){
                ans.add(A.get(i).get(columnEnd));
            }
            columnEnd --;
            if(rowBegin<=rowend){
                for(int i = columnEnd;i>=columnBegin;i--){
                    ans.add(A.get(rowend).get(i));
                }
            }
            rowend --;
            if(columnBegin<=columnEnd){
                for(int i = rowend;i>=rowBegin;i--){
                    ans.add(A.get(i).get(columnBegin));
                }
            }
            columnBegin++ ;
        }
        return ans;
    }
}
