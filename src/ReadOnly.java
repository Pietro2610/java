public class ReadOnly {

    private String name = "Bartek";

    // getter pozwala skorzystać z danych private w innych klasach
    public String getName() {
        return name + " jest ok";
    }

    // setter umożliwia przypisanie wartości do pola w innych klasach
    public void setName (String name) {
        this.name = name;
    }
}
