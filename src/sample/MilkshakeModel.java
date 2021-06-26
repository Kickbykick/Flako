package sample;

import java.util.ArrayList;
import java.util.List;

public class MilkshakeModel {

    float totalPrice = 0;
    MilkShakeListener currentPick;
    ArrayList<ToppingModel> toppingItemsList = new ArrayList<>();
    ArrayList<FlavorModel> flavourItemsList = new ArrayList<>();

    // add toppings and flavor
    // remove toppings and flavor
    // Total price
    // current pick
    // able to add multiple items


    // Returns index of item if it exists
    int checkIfItemExists(MilkShakeListener milkShakeItem){
        if(milkShakeItem instanceof ToppingModel){
            ToppingModel tempToppingModel = (ToppingModel) milkShakeItem;
            for(int i = 0; i < toppingItemsList.size(); i++){
                ToppingModel arrayToppingModel = (ToppingModel) toppingItemsList.get(i);
                if(tempToppingModel.toppingName == arrayToppingModel.toppingName){
                    return i;
                }
            }
        } else if(milkShakeItem instanceof FlavorModel){
            FlavorModel tempFlavorModel = (FlavorModel) milkShakeItem;
            for(int i = 0; i < flavourItemsList.size(); i++){
                FlavorModel arrayFlavorModel = (FlavorModel) flavourItemsList.get(i);
                if(tempFlavorModel.flavorName == arrayFlavorModel.flavorName){
                    return i;
                }
            }
        }

        return -1;
    }

    void addItem(MilkShakeListener milkShakeItem){
        if(milkShakeItem instanceof ToppingModel){
            int itemIndex = checkIfItemExists(milkShakeItem);

            if(itemIndex == -1){
                this.toppingItemsList.add((ToppingModel) milkShakeItem);
                totalPrice += 0.5;
                milkShakeItem.modelChanged();
                currentPick = milkShakeItem;
            } else {
                toppingItemsList.get(itemIndex).changeQuantity(true);
                if(toppingItemsList.get(itemIndex).toppingQuantity < 7){
                    totalPrice += 0.5;
                    milkShakeItem.modelChanged();
                    currentPick = milkShakeItem;
                }
            }
        } else if(milkShakeItem instanceof FlavorModel){
            int itemIndex = checkIfItemExists(milkShakeItem);

            if(itemIndex == -1){
                this.flavourItemsList.add((FlavorModel) milkShakeItem);
                totalPrice += 1;
                milkShakeItem.modelChanged();
                currentPick = milkShakeItem;
            } else {
                flavourItemsList.get(itemIndex).changeQuantity(true);
                if(flavourItemsList.get(itemIndex).flavorQuantity < 7){
                    totalPrice += 1;
                    milkShakeItem.modelChanged();
                    currentPick = milkShakeItem;
                }
            }
        }
    }

    void removeItem(MilkShakeListener milkShakeItem){
        if(milkShakeItem instanceof ToppingModel){
            int itemIndex = checkIfItemExists(milkShakeItem);

            if(itemIndex != -1){
                toppingItemsList.get(itemIndex).changeQuantity(false);
                totalPrice -= 0.5;
                milkShakeItem.modelChanged();
                if(toppingItemsList.get(itemIndex).toppingQuantity == 0)  this.toppingItemsList.remove(itemIndex);
            }
        } else if(milkShakeItem instanceof FlavorModel){
            int itemIndex = checkIfItemExists(milkShakeItem);

            if(itemIndex != -1){
                flavourItemsList.get(itemIndex).changeQuantity(false);
                totalPrice -= 1;
                milkShakeItem.modelChanged();
                if(flavourItemsList.get(itemIndex).flavorQuantity == 0)  this.flavourItemsList.remove(itemIndex);
            }
        }
    }
}
