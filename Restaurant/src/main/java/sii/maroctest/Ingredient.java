package sii.maroctest;

public class Ingredient {
    protected String name;
    protected int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void reduceQuantity(String orderDescription) {
        if (orderDescription.contains("Tomato Mozzarella Salad")) {
            reduceQuantityAfterPreparingaSalad();

        } else if (orderDescription.contains("Pizza")) {
            reduceQuantityAfterBakingApizza();

        }

    }

    public void reduceQuantityAfterBakingApizza() {
        if (this instanceof Mozzarella) {
            quantity -= 1;
        } else if (this instanceof Tomatoes) {
            quantity -= 4;
        }
    }

    public void reduceQuantityAfterPreparingaSalad() {
        if (this instanceof Mozzarella) {
            quantity -= 1;
        } else if (this instanceof Tomatoes) {
            quantity -= 2;
        }
    }
}
