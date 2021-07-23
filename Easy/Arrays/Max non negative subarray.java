public class Solution {
    public int[] maxset(int[] A) {
        int len=A.length;
        int q=0,length1=0,lencount=0;
        long currsum=0,maxsum=0;
        for(int i=len-1;i>=0;i--)
        {   
			currsum+=A[i];
			lencount++;
            if(A[i]<0)
            {
                currsum=0;
                lencount=0;
            }
            else 
			if(currsum>=maxsum)
            {
				if(currsum==maxsum && length1>lencount)
				{//System.out.println(A[i])
				continue;
				}
				else
        {//System.out.println(A[i]);
				maxsum=currsum;
                q=i;
                length1=lencount;
				}    
            }
        }
        int b[]=new int[length1];
        for (int j=0;j<length1;q++,j++)
        b[j]=A[q];
        return b;
    }
}
