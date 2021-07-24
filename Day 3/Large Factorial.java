import java.math.*;
public class Solution {
    public String solve(int A) {
        BigInteger fact = new BigInteger("1");

    for(int i = A; i > 0; i--){
        fact = fact.multiply(BigInteger.valueOf(i));
    }
    
    return fact + "";
    }
}
