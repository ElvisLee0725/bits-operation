// Bitmask
// Time: O(n), Space: O(1), 32 bits

class Solution {
    public static void main(String[] args) {
        System.out.print(new Solution().checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    public boolean checkIfPangram(String sentence) {
        int bitmask = 0;
        for(int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            bitmask |= (1 << ch - 'a');
        }
        return bitmask == ((1 << 26) - 1);
    }
}