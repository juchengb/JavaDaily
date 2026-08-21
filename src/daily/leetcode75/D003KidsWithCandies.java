// 1431. Kids With the Greatest Number of Candies
public class D003KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        List<Boolean> ans = new ArrayList<>();
        for (int candy : candies) {
            ans.add(candy + extraCandies >= max);
        }     
        return ans;
    }

}
