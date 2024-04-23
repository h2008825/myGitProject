package fruit;


public class Apple {
    private float price;
    private float weight;
    private float discount;

    public Apple(float price, float weight, float discount) {
        this.price = price;
        this.weight = weight;
        this.discount = discount;
    }

    public float calculatePay(){
        return Math.round(price*weight*discount);
    }
}
