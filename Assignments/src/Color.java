public enum Color {
    RED("#ff0000"),
    BLUE("#0000ff"),
    GREEN("#00ff00"),
    WHITE("#ffffff"),
    BLACK("#000000"),
    PINK("#DF84D9");

    private final String hexcode;

    private Color(String hexcode) {
        this.hexcode = hexcode;
    }

    public String getHexcode() {
        return hexcode;
    }
}
