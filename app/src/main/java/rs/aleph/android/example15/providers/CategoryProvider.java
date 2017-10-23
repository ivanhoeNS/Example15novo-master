package rs.aleph.android.example15.providers;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example15.model.Categoryjelo;

public class CategoryProvider {

    public static List<Categoryjelo> getCategories() {

        List<Categoryjelo> categories = new ArrayList<>();
        categories.add(new Categoryjelo(0, "Rose"));
        categories.add(new Categoryjelo(1, "Citrus"));
        categories.add(new Categoryjelo(2, "Berry"));
        return categories;
    }

    public static List<String> getCategoryNames() {
        List<String> names = new ArrayList<>();
        names.add("Rose");
        names.add("Citrus");
        names.add("Berry");
        return names;
    }

    public static Categoryjelo getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Categoryjelo(0, "Rose");
            case 1:
                return new Categoryjelo(1, "Citrus");
            case 2:
                return new Categoryjelo(2, "Berry");
            default:
                return null;
        }
    }
}
