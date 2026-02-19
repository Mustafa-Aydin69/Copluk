class Solution {

    public boolean isMatch(String s, String p) {
        return matchHelper(s, p, 0, 0);
    }

    private boolean matchHelper(String s, String p, int i, int j) {

        // pattern bittiyse string de bitmeli
        if (j == p.length()) {
            return i == s.length();
        }

        // şu anki karakter eşleşiyor mu?
        boolean firstMatch = (i < s.length() &&
                (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.'));

        // sıradaki karakter '*' mı?
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {

            // 1️⃣ '*' hiç kullanılmaz → pattern 2 ileri
            // 2️⃣ '*' kullanılır → string 1 ileri, pattern aynı kalır
            return (matchHelper(s, p, i, j + 2) ||
                    (firstMatch && matchHelper(s, p, i + 1, j)));
        }

        else {
            // normal karakter
            return firstMatch && matchHelper(s, p, i + 1, j + 1);
        }
    }
}
