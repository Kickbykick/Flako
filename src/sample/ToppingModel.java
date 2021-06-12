package sample;

// MilkShakeEnum, TotalPrice, Quantity, Name, Type

public class ToppingModel implements MilkShakeListener{

    MilkShakeEnum milkShakeEnum;
    float toppingTotalPrice;
    int toppingQuantity;
    String toppingName;

    public ToppingModel(String toppingName){
        this.milkShakeEnum = MilkShakeEnum.TOPPING;
        this.toppingName = toppingName;
        this.toppingQuantity = 0;
        this.toppingTotalPrice = .0f;
    }

    void changeQuantity(boolean bIncrease){
        if(bIncrease){
            toppingQuantity++;
            toppingTotalPrice += 0.5;
        } else {
            if(toppingQuantity > 0) {
                toppingQuantity--;
                toppingTotalPrice -= 0.5;
            }
        }
    }

    @Override
    public void modelChanged() {

    }
}
