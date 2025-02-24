class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # max_val = 0

        # for i in range(len(prices)) :
        #     for j in range(i+1,len(prices)) :
        #         print(prices[i] - prices[j])
        #         if prices[i] - prices[j] < max_val:
        #             max_val = prices[i] - prices[j]
        # return - max_val

        left, right = 0, 1
        maxP = 0

        while right < len(prices):
            if prices[left] < prices[right]:
                profit = prices[right] - prices[left]
                maxP = max(maxP, profit)
            else:
                left = right
            right += 1
        return maxP