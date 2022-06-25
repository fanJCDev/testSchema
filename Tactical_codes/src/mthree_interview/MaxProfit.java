package mthree_interview;

public class MaxProfit {
    public static int ProfitIs(int[] arry) {
        int len = arry.length;
        int profit = 0;
        for (int i = 1; i < len; i++) {
            int sub = arry[i] - arry[i - 1];
            if (sub > 0) profit += sub;
        }
        return profit;
    }

    public static void main(String[] args) {
        int price[] = {2, 30, 15, 10, 8, 25, 80};
        System.out.print("Maximum Profit=" + ProfitIs(price));
    }
}
