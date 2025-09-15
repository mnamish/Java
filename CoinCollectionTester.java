package Sets;

public class CoinCollectionTester {
    public static void main(String[] args) {
        // Create a new CoinCollection
        CoinCollection collection = new CoinCollection();

        // Sample data
        String[] sampleData = {
            "1941, penny",
            "2010, dime",
            "2009, quarter",
            "1954, nickel",
            "1987, dime",
            "1949, penny",
            "1982, dime",
            "1955, penny",
            "2002, quarter",
            "2008, quarter",
            "1952, nickel",
            "1931, penny",
            "1989, dime"
        };

        // Add coins to the collection
        for (String data : sampleData) {
            String[] parts = data.split(", ");
            int year = Integer.parseInt(parts[0]);
            String denomination = parts[1];
            collection.addCoin(new Coin(year, denomination));
        }

        // Print the collection
        System.out.println(collection);
    }
}