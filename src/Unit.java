public enum Unit {
    GRAM("gram"),
    KILOGRAM("kilo"),
    PIECE("stuk(s)"),
    TEASPOONS("theelepels"),
    PINCH("snuf");

    private final String unitName;

    Unit(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitName() {
        return unitName;
    }
}
