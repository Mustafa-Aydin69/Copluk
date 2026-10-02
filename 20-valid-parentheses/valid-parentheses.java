class Solution {
    public boolean isValid(String s) {
        Stack<Character> cevap = new Stack<>();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') cevap.push(s.charAt(i));
            else {
                if(cevap.isEmpty()) return false;
                char üst = cevap.pop();
                if(s.charAt(i) == ')' && üst != '(') return false;
                if(s.charAt(i) == ']' && üst != '[') return false;
                if(s.charAt(i) == '}' && üst != '{') return false;
            }

        }
        return cevap.isEmpty();
    }
}