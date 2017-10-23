package rs.aleph.android.example15.model;

/**
 * Created by androiddevelopment on 18.10.17..
 */

public class Sastojci {

    private int id;
    private String name;
    private String description;
    private float rating;
    private Jelo jelo;

    public Sastojci() {

    }

    public Sastojci(int id, String image, String name, String description, Jelo jelo) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.jelo = jelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        this.id = id;
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

    public Jelo getJelo() {
        return jelo;
    }

    public void setJelo(Jelo jelo) {
        this.jelo= jelo;
    }

    @Override
    public String toString() {
        return name;
    }
}
