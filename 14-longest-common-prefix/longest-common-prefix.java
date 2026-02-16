class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        String first = strs[0];
        for(int i = 0;i < first.length();i++){
            for (int j = 1; j<strs.length;j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != first.charAt(i)){
                    return result.toString();
                }
            }
            result.append(first.charAt(i));
        }
        return result.toString();
    }
}