import java.util.ArrayList;

public class ApplePieRecipe {

    /* Step 1 */
    public void prepareHeatOven() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)\n");
    }
    /* Step 2 */
    public void prepareEggForApplePie() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.\n");
    }
    /* Step 3 */
    public void prepareDough() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.\n");
    }
    /* Step 4 */
    public void prepareApples() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.\n");
    }
    /* Step 5 */
    public void prepareBakingForm() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem\n");
    }
    /* Step 6 */
    public void assembleBottomLayer() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.\n");
    }
    /* Step 7 */
    public void layerApplesAndSugar() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.\n");
    }
    /* Step 8 */
    public void createDoughStrips() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.\n");
    }
    /* Step 9 */
    public void arrangeDoughStrips() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken\n");
    }
    /* Step 10 */
    public void glazeWithEgg() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.\n");
    }
    
    public void printRecipeInstructions() {
        System.out.println("Stappen:\n");
        this.prepareHeatOven();
        this.prepareEggForApplePie();
        this.prepareDough();
        this.prepareApples();
        this.prepareBakingForm();
        this.assembleBottomLayer();
        this.layerApplesAndSugar();
        this.createDoughStrips();
        this.arrangeDoughStrips();
        this.glazeWithEgg();
    }

    public void printIngredients(ArrayList<Ingredient> ingredients) {
        System.out.println("Ingrediénten:\n");
        ingredients.forEach(ingredient ->
                System.out.println(ingredient.getAmount() + " " +
                        ingredient.getUnit().getUnitName() + " " +
                        ingredient.getName() + "\n")
        );
    }
}
