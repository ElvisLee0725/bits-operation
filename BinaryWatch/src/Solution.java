import java.util.ArrayList;
import java.util.List;

// From all the hour and min combinations, check if their 1 bits sum equals to num? If so, we found a combination
// Time: O(mn), Space: O(m+n)
class Solution {
    public static void main(String[] args) {
        List<String> res = new Solution().readBinaryWatch(3);
        for(String s : res) {
            System.out.println(s);
        }
    }
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList();

        for(int h = 0; h <= 11; h++) {
            int hourBits = Integer.bitCount(h);
            for(int m = 0; m <= 59; m++) {
                int minBits = Integer.bitCount(m);
                if(hourBits + minBits == num) {
                    String mStr = m >= 10 ? Integer.toString(m) : "0" + Integer.toString(m);
                    res.add(Integer.toString(h) + ":" + mStr);
                }
            }
        }
        return res;
    }
}
