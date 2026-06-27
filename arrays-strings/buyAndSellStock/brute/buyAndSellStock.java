class buyAndSellStock {
    public static int maxProfitF(int[] prices) {
        int largestProfit = 0;
        for (int i = 0; i< prices.length; i++){
            int current = prices[i];

            for(int j = i+1; j< prices.length; j++){
                int profit = prices[j] - current;

                if(profit > largestProfit) largestProfit = profit;
            }
        }

        return largestProfit;
    }


    public static void main(String[] args) {

      int[] i = {7,1,5,3,6,4};

      int result = maxProfitF(i);

        System.out.println(result);
    }
}