package Sets;

public class Coin {
    private int year;
    private String denomination;

    public Coin(int year, String denomination) {
        this.year = year;
        this.denomination = denomination;
    }

    public int getYear() {
        return year;
    }

    public String getDenomination() {
        return denomination;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        } 
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Coin coin = (Coin) obj; 

        return denomination.equals(coin.denomination) && (year / 10 == coin.year / 10);
    }

    @Override
    public String toString() {
        return  " YEAR: " + year + " || TYPE: " + denomination ;
    }
}