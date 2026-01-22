class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anaMap = new HashMap<>();

        for(String str : strs){
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);

            String newStr = String.valueOf(cArr);

            if(!anaMap.containsKey(newStr)){
                anaMap.put(newStr, new ArrayList<>());
            }
            anaMap.get(newStr).add(str);
        }
        List<List<String>> answer = new ArrayList<>(anaMap.values());
        return answer;
    }
}