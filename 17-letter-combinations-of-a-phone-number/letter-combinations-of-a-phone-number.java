class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        List<String> result = new ArrayList<>();
        result.add("");
        for(int i = 0;i<digits.length();i++){
            List<String> temp = new ArrayList<>();
            char digit = digits.charAt(i);
            String str = map.get(digit);

            
            for(String comb : result){
                for(char c : str.toCharArray()){
                    temp.add(comb + c);
                }
            }
            result = temp;
        }
        return result;
    }
}