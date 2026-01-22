class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> pq = 
        new PriorityQueue<>(
            (a,b) -> b.getValue() - a.getValue()
        );

        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0) +1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.add(entry);
        }

        int[] result = new int[k];

        for(int i=0; i<k; i++){
            result[i] = pq.poll().getKey();
        }

        return result;
    }
}
