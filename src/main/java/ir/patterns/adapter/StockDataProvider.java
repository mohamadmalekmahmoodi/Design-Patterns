package ir.patterns.adapter;

public class StockDataProvider {
    // this class is for getting data and provides them

    private StockDataReader stockDataReader;

    public StockDataProvider(StockDataReader stockDataReader) {
        this.stockDataReader = stockDataReader;
    }

    public String read(String market){
        return XmlDataBeautifier.format(stockDataReader.readDate(market));
    }
}
