package ir.patterns.adapter;

public class CapitalIntelligentStockDataReader implements IntelligentStockDataReader {
    @Override
    public JsonData read() {
        return new JsonData("capital market intelligent data");
    }
}
