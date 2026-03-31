class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];

        for ( int price: prices){
            min = Math.min(min, price);
            max = Math.max(max, price-min>0 ? price-min: 0 );
        }
        return max;
        
    }
}
