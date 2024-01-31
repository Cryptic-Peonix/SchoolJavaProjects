public class Person {
    private String name;
    private int age;
    private Color favColor;

    public Person(String name, int age, Color favColor) {
        this.name = name; this.age = age; this.favColor = favColor;
    }

    public Person() {
        this.name = "Testy McTesterson";
        this.age = 50;
        this.favColor = Color.BLACK;
    }

    public int getAge() {
        return age;
    }

    public Color getFavColor() {
        return favColor;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavColor(Color favColor) {
        this.favColor = favColor;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.age + ", Favorite Color: " + this.favColor + ".";
    }

    public void setName(String name) {
        this.name = name;
    }
}
