package sii.maroctest;

public class IngredientBuilder {
    private static final int QUANTITY_INDEX = 0;
    private static final int NAME_INDEX = 1;
    private static final int SECOND_NAME_INDEX = 2;
    private String ingredientdescription;

    public IngredientBuilder withDescription(String description){
        ingredientdescription=description;
        return this;
    }


        public Ingredient build(){
        Ingredient ingredient = new Ingredient();
        ingredient.setQuantity(Integer.parseInt(ingredientdescription.split(" ")[QUANTITY_INDEX]));
        ingredient.setName(ingredientdescription.split(" ")[NAME_INDEX] + ingredientdescription.split(" ")[SECOND_NAME_INDEX]);
        return ingredient;
        }
}
