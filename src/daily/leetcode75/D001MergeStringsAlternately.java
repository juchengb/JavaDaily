// 1768. Merge Strings Alternately
public class D001MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {
        int w1l = word1.length();
        int w2l = word2.length();
        int i = 0, j = 0;
        StringBuilder ans = new StringBuilder();
        while(i < w1l || j < w2l){
            if(i < w1l){
                ans.append(word1.charAt(i++));
            }
            if(j < w2l){
                ans.append(word2.charAt(j++));
            }           
        }
        return ans.toString();
    }

}
