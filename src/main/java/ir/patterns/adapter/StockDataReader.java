package ir.patterns.adapter;

public interface StockDataReader {
    //this class fetches some data by the entry : market and returns a xmlData
    XmlData readDate(String market);
}
