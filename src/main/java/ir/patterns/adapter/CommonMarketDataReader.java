package ir.patterns.adapter;

public class CommonMarketDataReader implements StockDataReader{

    //this class says , if the market was money(ارز) read the money market or data
    //and if the market was capital (سزمایه) read the capital market or data

    @Override
    public XmlData readDate(String market) {
        if (market.compareToIgnoreCase("money") == 0){
            return new XmlData("money market common data");
        }else if (market.compareToIgnoreCase("capital") == 0){
            return new XmlData("money market common data");
        }else
            System.out.println("market not found");
            return null;
    }
}
