import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ApplePieRecipe applePieRecipe = new ApplePieRecipe();

        Ingredient unsaltedButter = new Ingredient(200, Unit.GRAM, "ongezouten roomboter");
        Ingredient whiteCasterSugar = new Ingredient(200, Unit.GRAM, "witte bastard suiker");
        Ingredient selfRaisingFlour = new Ingredient(400, Unit.GRAM, "zelfrijzend bakmeel");
        Ingredient egg = new Ingredient(1, Unit.PIECE, "ei");
        Ingredient vanillaSugar = new Ingredient(8, Unit.GRAM, "vanillesuiker");
        Ingredient pinchOfSalt = new Ingredient(1, Unit.PINCH, "zout");
        Ingredient sweetAndSourApples = new Ingredient((int) 1.5, Unit.KILOGRAM, "zoetzure appels");
        Ingredient granulatedSugar = new Ingredient(75, Unit.GRAM, "kristal suiker");
        Ingredient cinnamon = new Ingredient(3, Unit.TEASPOONS, "kaneel");
        Ingredient breadcrumbs = new Ingredient(15, Unit.GRAM, "paneermeel");

        ArrayList<Ingredient> ingredients = new ArrayList<>();

        ingredients.add(unsaltedButter);
        ingredients.add(whiteCasterSugar);
        ingredients.add(selfRaisingFlour);
        ingredients.add(egg);
        ingredients.add(vanillaSugar);
        ingredients.add(pinchOfSalt);
        ingredients.add(sweetAndSourApples);
        ingredients.add(granulatedSugar);
        ingredients.add(cinnamon);
        ingredients.add(breadcrumbs);

        applePieRecipe.printIngredients(ingredients);
        applePieRecipe.printRecipeInstructions();
    }
}