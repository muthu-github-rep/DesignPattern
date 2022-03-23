package StrategyPattern;

public class CalculateTradeAmount {
    private TradeAmountStrategy strategy;

    // On object creation specify which strategy (functional interface) to use
    public CalculateTradeAmount(TradeAmountStrategy strategy) {
           this.strategy = strategy;
    }

    // Execute the functional interfaces lambda expression implementation
    public void exec() {
         strategy.execute();
    }
}
