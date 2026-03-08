class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price : prices){
            if(minPrice > price) {
                minPrice = price;
            } else if(price - minPrice > maxProf){
                maxProf = price - minPrice;
            }
        }
        return maxProf;
    }
}