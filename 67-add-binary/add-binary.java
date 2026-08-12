class Solution {
    public String addBinary(String a, String b) {
        int elde = 0;
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;

        while(i >= 0 || j >= 0 || elde > 0){
            int total = elde;
            if(i >= 0) total += a.charAt(i--) - '0';
            if(j >= 0) total += b.charAt(j--) - '0';

            sb.append(total %2);
            elde = total  /2;
        }
        return sb.reverse().toString();
    }
}