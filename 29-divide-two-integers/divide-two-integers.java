class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend > Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE / divisor;
        } 
        else if (dividend < Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE / divisor;
        }
        else if (dividend == Integer.MIN_VALUE && divisor == -1)
        {
            return Integer.MAX_VALUE;
        }
        return divisor == 0 ? 0 : (int)(dividend / divisor);
        
    }
}