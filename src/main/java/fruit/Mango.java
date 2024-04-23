package fruit;

public class Mango {
    private float price;
    private float weight;
    private float discount;

    public Mango(float price, float weight, float discount) {
        this.price = price;
        this.weight = weight;
        this.discount = discount;
    }

    public float calculatePay(){
        return Math.round(price*weight*discount);
    }
}
