package sii.maroctest;

import sii.maroctest.exceptions.OutOfStockException;

public class Ticket {

    private String order;
    private String secondOrder;
    private int numberOfadditionalOrders;

    public Ticket(String orderDescription) {
        this.order = orderDescription;
    }

    public int getNumberOfDishesInOrder() throws OutOfStockException {
        int numberOfOrderedDishes = Integer.parseInt(order.split(" ")[0]) + numberOfadditionalOrders;
        if ((numberOfOrderedDishes <= Restaurant.getMinimumIngredientQuantity())) {
            return numberOfOrderedDishes;
        } else throw new OutOfStockException("we ran out of  supplies");

    }

    public Ticket and(String additionalOrderDescription) {
        secondOrder = additionalOrderDescription.split(" ")[1];
        numberOfadditionalOrders = Integer.parseInt(additionalOrderDescription.(" ")[0]);
        return this;
    }

    public boolean checkIfOrderIsPizza() {
        return "pizza".equals(order) || "pizza".equals(secondOrder);
    }
}
