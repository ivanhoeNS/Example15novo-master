package rs.aleph.android.example15.providers;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example15.model.Categoryjelo;
import rs.aleph.android.example15.model.Jelo;

public class JeloProvider {

    public static List<Jelo> getJela() {

        Categoryjelo rose = new Categoryjelo(0, "Rose");
        Categoryjelo citrus = new Categoryjelo(1, "Citrus");
        Categoryjelo berry = new Categoryjelo(2, "Berry");

        List<Jelo> jela = new ArrayList<>();
        jela.add(new Jelo(0, "apples.jpg", "Apples", "The apple tree is a deciduous tree in the rose family best known for its sweet, pomaceous fruit, the apple.", 5.0f, rose));
        jela.add(new Jelo(1, "bananas.jpg", "Bananas", "The banana is an edible fruit, botanically a berry, produced by several kinds of large herbaceous flowering plants in the genus Musa.", 4.0f, berry));
        jela.add(new Jelo(2, "oranges.jpg", "Oranges", "The orange is the fruit of the citrus species Citrus in the family Rutaceae.", 3.0f, citrus));
        return jela;
    }

    public static List<String> getJeloNames() {

        List<String> names = new ArrayList<>();
        names.add("Apples");
        names.add("Bananas");
        names.add("Oranges");
        return names;
    }

    public static Jelo getJeloById(int id) {

        Categoryjelo rose = new Categoryjelo(0, "Rose");
        Categoryjelo citrus = new Categoryjelo(1, "Citrus");
        Categoryjelo berry = new Categoryjelo(2, "Berry");

        switch (id) {
            case 0:
                return new Jelo(0, "apples.jpg", "Apples", "The apple tree is a deciduous tree in the rose family best known for its sweet, pomaceous fruit, the apple.", 5.0f, rose);
            case 1:
                return new Jelo(1, "bananas.jpg", "Bananas", "The banana is an edible fruit, botanically a berry, produced by several kinds of large herbaceous flowering plants in the genus Musa.", 4.0f, berry);
            case 2:
                return new Jelo(2, "oranges.jpg", "Oranges", "The orange is the fruit of the citrus species Citrus in the family Rutaceae.", 3.0f, citrus);
            default:
                return null;
        }
    }
}
