public class LC121BestTimetoBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int diff = 0;
        int largNum = 0;
        int largeNumPos = 0;
        int smallNum;
        int smallNumPos = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > largNum) {
                largNum = prices[i];
                largeNumPos = i;
                System.out.println(largNum+"large"+largeNumPos);
            }
            if (prices[i] < smallNum) {
                smallNum = prices[i];
                smallNumPos = i;
                System.out.println(smallNum+"small"+smallNumPos);
            }
            for (int j = 0; j < largeNumPos; j++) {
                diff = prices[i] - prices[j];
                if (diff > maxProfit) {
                    maxProfit = diff;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        LC121BestTimetoBuyAndSellStock obj = new LC121BestTimetoBuyAndSellStock();
        int[] array = { 7,6,4,3,1 };
        System.out.println(obj.maxProfit(array));
    }

}