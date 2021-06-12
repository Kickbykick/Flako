package sample;

public class FlavorModel  implements MilkShakeListener{

    MilkShakeEnum milkShakeEnum;
    float flavorTotalPrice;
    int flavorQuantity;
    String flavorName;

    public FlavorModel(String flavorName){
        this.milkShakeEnum = MilkShakeEnum.FLAVOUR;
        this.flavorName = flavorName;
        this.flavorQuantity = 0;
        this.flavorTotalPrice = .0f;
    }

    void changeQuantity(boolean bIncrease){
        if(bIncrease){
            flavorQuantity++;
            flavorTotalPrice += 1;
        } else {
            if(flavorQuantity > 0) {
                flavorQuantity--;
                flavorTotalPrice -= 1;
            }
        }
    }

    @Override
    public void modelChanged() {

    }
}
