class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int ikiOnceki = 1;
        int birOnceki = 2;
        
        for (int i = 3; i <= n; i++) {
            int suAnki = birOnceki + ikiOnceki;
            ikiOnceki = birOnceki;
            birOnceki = suAnki;
        }
        
        return birOnceki;
    }
}
