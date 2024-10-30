package ir.patterns.adapter;

public class IntelligentStockDataReaderAdapter implements StockDataReader {
    //in this class we are converting something to something else
    //this is the adapter class
    private IntelligentStockDataReader dataReader;

    @Override
    public XmlData readDate(String market) {
        if (market.compareToIgnoreCase("capital") == 0) {
            dataReader = new CapitalIntelligentStockDataReader();
        } else if (market.compareToIgnoreCase("money") == 0) {
            dataReader = new MoneyIntelligentStockDataReader();
        }
        JsonData jsonData = dataReader.read();
        return convertToXml(jsonData);
    }

    private XmlData convertToXml(JsonData jsonData) {
        return new XmlData(jsonData.getData());
    }
}

