package sii.maroctest;

import sii.maroctest.exceptions.OutOfStockException;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private static List<Ingredient> ingredientStocks;


    public Restaurant(String... ingredientInformations) {
        ingredientStocks = new ArrayList<>();
        for (String ingredientInfo : ingredientInformations) {
            ingredientStocks.add(IngredientFactory.getIngredient(ingredientInfo));
        }
    }

    public Ticket order(String orderDescription) {
        Ticket returnedTicket = new Ticket(orderDescription);
        if (orderDescription.contains("Tomato Mozzarella Salad")) {
            ingredientStocks.stream().forEach(ingredient -> ingredient.reduceQuantity(orderDescription));
        }
        return returnedTicket;
    }

    public Meal retrieve(Ticket ticket) throws OutOfStockException {
        Meal orderdMeal ;
        orderdMeal = new MealBuilder().withDishes(ticket).withTicket(ticket).build();
        return orderdMeal;
    }


    public static int getMinimumIngredientQuantity() {
        return ingredientStocks.stream().mapToInt(Ingredient::getQuantity).min().orElse(1000000);         //todo refactor

    }

}
