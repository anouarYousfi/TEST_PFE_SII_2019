package sii.maroctest;


public class IngredientFactory {


    private static final int INGREDIENT_NAME_INDEX = 1;
    private static final int INGREDIENT_SECONDNAME_INDEX = 2;

    public static Ingredient getIngredient(String ingredientDescription) {
        String ingredientName = ingredientDescription.split(" ")[INGREDIENT_NAME_INDEX] + ingredientDescription.split(" ")[INGREDIENT_SECONDNAME_INDEX];
        if ("balls Mozzarella".equals(ingredientName)) {
            return new Mozzarella();
        } else if ("tomatoes".equals(ingredientName)) {
            return new Tomatoes();
        } else if ("olive oil".equals(ingredientName)) {
            return new Tomatoes();
        } else {
            return new Pepper();
        }
    }
}
