package StrategyPattern;

public class CalculateTradeAmount {
    private TradeAmountStrategy strategy;

    public CalculateTradeAmount(TradeAmountStrategy strategy) {
           this.strategy = strategy;
    }
    public void exec() {
         strategy.execute();
    }
}
