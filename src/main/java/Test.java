import fruit.Apple;
import fruit.Mango;
import fruit.Strawberry;

public class Test {
    public static void main(String[] args) {

        //顾客A 2斤苹果 2斤草莓
        float pay1=calculateCustomeA(2,2);
        System.out.println("顾客A购买商品总价为:"+pay1);
        assert Math.round(2*8+2*13)==pay1:"顾客A商品总价计算不正确";

        //顾客B 2斤苹果 2斤草莓 2斤芒果
        float pay2=calculateCustomeB(2,2,2);
        System.out.println("顾客B购买商品总价为:"+pay2);
        assert Math.round(2*8+2*13+2*20)==pay2:"顾客B商品总价计算不正确";

        //顾客C 2斤苹果 2斤草莓 2斤芒果 草莓打8折
        float pay3=calculateCustomeC(2,2,2);
        System.out.println("顾客C购买商品总价为:"+pay3);
        assert Math.round(2*8+2*13*0.8+2*20)==pay3:"顾客C商品总价计算不正确";

        //顾客D 2斤苹果 2斤草莓 2斤芒果草莓打8折,满100减10
        float pay4=calculateCustomeD(2,2,2);
        System.out.println("顾客D购买商品总价为:"+pay4);
        assert (Math.round(2*8+2*13*0.8+2*20)>=100?Math.round(2*8+2*13*0.8+2*20)-10:Math.round(2*8+2*13*0.8+2*20))==pay4:"顾客D商品总价计算不正确";

    }

    public static float calculateCustomeA(float appleWeight,float strawberryWeight){
        Apple apple1=new Apple(8,appleWeight,1);
        Strawberry strawberry1=new Strawberry(13,strawberryWeight,1);
        return Math.round(apple1.calculatePay()+ strawberry1.calculatePay());

    }

    public static float calculateCustomeB(float appleWeight,float strawberryWeight,float mangoWeight){
        Apple apple2=new Apple(8,appleWeight,1);
        Strawberry strawberry2=new Strawberry(13,strawberryWeight,1);
        Mango mango2=new Mango(20,mangoWeight,1);
        return Math.round(apple2.calculatePay()+ strawberry2.calculatePay()+ mango2.calculatePay());
    }

    public static float calculateCustomeC(float appleWeight,float strawberryWeight,float mangoWeight){
        Apple apple3=new Apple(8,appleWeight,1);
        Strawberry strawberry3=new Strawberry(13,strawberryWeight,0.8f);
        Mango mango3=new Mango(20,mangoWeight,1);
        return Math.round(apple3.calculatePay()+ strawberry3.calculatePay()+ mango3.calculatePay());
    }

    public static float calculateCustomeD(float appleWeight,float strawberryWeight,float mangoWeight){
        Apple apple3=new Apple(8,appleWeight,1);
        Strawberry strawberry3=new Strawberry(13,strawberryWeight,0.8f);
        Mango mango3=new Mango(20,mangoWeight,1);
        float pay3=Math.round(apple3.calculatePay()+ strawberry3.calculatePay()+ mango3.calculatePay());
        if(pay3>=100){
            return pay3-10;
        }
        return pay3;
    }

}
