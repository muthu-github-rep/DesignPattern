package StrategyPattern;



public class TradeAmountCalculator {
    public static void main(String[] args) {

       TradeAmountStrategy highMarketValue =()->System.out.println(" Calculate Trade Amount With High Margin");
       highMarketValue.execute();

        TradeAmountStrategy lowMarketValue =()->System.out.println(" Calculate Trade Amount With Low Margin");
        lowMarketValue.execute();

    };
}
