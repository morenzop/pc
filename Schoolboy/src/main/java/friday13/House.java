package friday13;

public class House {
    private int windows;

    public House(int windows) {
        this.windows = windows;
    }

    public void setWindows(int windows){
        this.windows=windows;
    }
    public int getWindows(){
        return windows;
    }
    public void sellHouse(double priceToPay, double moneyYouGot){
        if (moneyYouGot < priceToPay){
            System.out.println("Sold");
        }else{
            System.out.println("Not Enough");
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                '}';
    }
}
