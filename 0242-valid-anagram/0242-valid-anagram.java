class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        String newS = String.valueOf(sArr);
        String newT = String.valueOf(tArr);

        if(newS.equals(newT)) return true;
        return false;
    }
}
