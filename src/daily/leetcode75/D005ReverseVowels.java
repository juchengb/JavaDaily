// 345. Reverse Vowels of a String - Two Pointers
public class D005ReverseVowels {

    public String reverseVowels(String s) {

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            
            while (left < right && !isVowel(chars[left])) { left++; } // 左指標向右尋找母音
            while (left < right && !isVowel(chars[right])) { right--; }// 右指標向左尋找母音
                
            // 交換
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);

    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}
