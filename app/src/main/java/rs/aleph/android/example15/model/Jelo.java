package rs.aleph.android.example15.model;

public class Jelo {

    private int id;
    private String image;
    private String name;
    private String description;
    private float rating;
    private Categoryjelo category;

    public Jelo() {

    }

    public Jelo(int id, String image, String name, String description, float rating, Categoryjelo category) {

        this.id = id;
        this.image = image;
        this.name = name;
        this.description = description;
        this.rating = rating;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Categoryjelo getCategory() {
        return category;
    }

    public void setCategory(Categoryjelo category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return name;
    }
}
