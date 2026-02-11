class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        
        ArrayList<Integer> uzunluklar = new ArrayList<>();
        // Boş dönmemesi için başlangıçta 0 ekleyebilirsin
        uzunluklar.add(0);

        for (int i = 0; i < s.length(); i++) {
            ArrayList<Character> harfler = new ArrayList<>();
            
            for (int j = i; j < s.length(); j++) {
                if (harfler.contains(s.charAt(j))) {
                    // Tekrar bulduğumuz anki uzunluğu kaydet ve çık
                    uzunluklar.add(harfler.size());
                    break;
                } else {
                    harfler.add(s.charAt(j));
                    // Eğer karakter tekrar etmeden metnin sonuna ulaştıysa
                    // o anki uzunluğu kaydetmeyi unutma!
                    if (j == s.length() - 1) {
                        uzunluklar.add(harfler.size());
                    }
                }
            }
        }
        return Collections.max(uzunluklar);
    }
}