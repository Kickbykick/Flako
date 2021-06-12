package sample;

import java.util.ArrayList;
import java.util.List;

public class MilkshakeModel {

    float totalPrice = 0;
    MilkShakeListener currentPick;
    ArrayList<MilkShakeListener> milkShakeItemArray;

    // add toppings and flavor
    // remove toppings and flavor
    // Total price
    // current pick
    // able to add multiple items

    void addItem(MilkShakeListener milkShakeItem){
        this.milkShakeItemArray.add(milkShakeItem);
        milkShakeItem.modelChanged();
        currentPick = milkShakeItem;

        if(milkShakeItem instanceof ToppingModel){
            totalPrice += 0.5;
        } else if(milkShakeItem instanceof FlavorModel){
            totalPrice += 1;
        }
    }

    void removeItem(MilkShakeListener milkShakeItem){
        this.milkShakeItemArray.remove(milkShakeItem);
        milkShakeItem.modelChanged();
//        currentPick = null;

        if(milkShakeItem instanceof ToppingModel){
            totalPrice -= 0.5;
        } else if(milkShakeItem instanceof FlavorModel){
            totalPrice -= 1;
        }
    }
}
