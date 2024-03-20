public class Ingredient {
    private Number amount;
    private Unit unit;
    private String name;

    public Ingredient() {
    }

    public Ingredient(Number amount, Unit unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public Number getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
