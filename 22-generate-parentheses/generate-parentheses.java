class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        karamq(result, new StringBuilder(),n,0,0);
        return result;
    }
    public void karamq (List<String> result,StringBuilder sb, int n, int open, int close){
        if(sb.length() == 2 * n){
            result.add(sb.toString());
            return ;
        }
        if(open<n){
            sb.append("(");
            karamq(result,sb,n,open+1,close);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(open>close){
            sb.append(")");
            karamq(result,sb,n,open,close+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}