package Sets;

public class CoinCollection {
    private mySet<Coin> coins;

    public CoinCollection() {
        coins = new mySet<>();
    }

    public void addCoin(Coin coin) {
        if (!coins.contains(coin)) {
            coins.add(coin);
        }
    }

    public mySet<Coin> getCoins() {
        return coins;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("COIN COLLECTION CONTENTS\n");
        for (Coin coin : coins) {
            sb.append(coin).append("\n");
        }
        return sb.toString();
    }
}
