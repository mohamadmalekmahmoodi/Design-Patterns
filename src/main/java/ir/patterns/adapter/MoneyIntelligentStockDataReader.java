package ir.patterns.adapter;

public class MoneyIntelligentStockDataReader implements IntelligentStockDataReader {
    @Override
    public JsonData read() {
        return new JsonData("money market intelligent data");
    }
}
