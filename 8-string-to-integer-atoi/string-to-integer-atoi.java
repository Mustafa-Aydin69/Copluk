class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;

        int i = 0;
        int n = s.length();
        s=s.trim();
        
        StringBuilder result = new StringBuilder();
        boolean x = false;
        if (s.length() == 0) return 0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            x = (s.charAt(0) == '-');
            i++;
        }

        while(i<s.length()){
            char c = s.charAt(i);
            if(c>= '0' && c<='9'){
                result.append(c);
            }else{
                break;
            }
            i++;
        }
        if(result.length() == 0) return 0;

        try{
            int value = Integer.parseInt(result.toString());
            return x ? -value : value;
        } catch(NumberFormatException e){
            return x ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}