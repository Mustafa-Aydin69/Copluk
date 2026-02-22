class Solution {
    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        while (num > 0) {
            if (num >= 1000) {
                roman.append("M");
                num -= 1000;
                continue;
            } else if(num >=900){
                roman.append("CM");
                num -= 900;
            } else if (num >= 500) {
                roman.append("D");
                num -= 500;
                continue;
            } else if(num >= 400){
                roman.append("CD");
                num -= 400;
                continue;                
            } else if (num >= 100) {
                roman.append("C");
                num -= 100;
                continue;
            } else if (num>= 90){
                roman.append("XC");
                num -= 90;
                continue;
            } else if (num >= 50) {
                roman.append("L");
                num -= 50;
                continue;
            } else if (num>= 40){
                roman.append("XL");
                num -= 40;
                continue;
            } else if(num >= 10){
                roman.append("X");
                num -= 10;
                continue;
            } else if (num == 9){
                roman.append("IX");
                num -= 9;
                continue;
            } else if(num >= 5){
                roman.append("V");
                num -=5;
                continue;
            } else if (num == 4){
                roman.append("IV");
                num -= 4;
                continue;
            } else {
                roman.append("I");
                num -= 1;
                continue;
            }

        }
        return roman.toString();
    }
}