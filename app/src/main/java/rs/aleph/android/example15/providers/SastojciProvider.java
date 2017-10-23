package rs.aleph.android.example15.providers;

import java.util.ArrayList;
import java.util.List;


import rs.aleph.android.example15.model.Sastojci;

/**
 * Created by androiddevelopment on 18.10.17..
 */

public class SastojciProvider {

    public static List<Sastojci> getSastojci() {


        List<Sastojci> sastojak = new ArrayList<>();
        sastojak.add(new Sastojci(0, "apples.jpg", "Masna Kiselina", "Pomaze razvoju pozitivnih bakterija i dobra je za probavu.", null));
        sastojak.add(new Sastojci(1, "bananas.jpg", "C vitamin", "Ojacava imuno sistem",null));
        sastojak.add(new Sastojci(2, "oranges.jpg", "Proteini", "Jacaju misicnu masu.", null));
        return sastojak;
    }

    public static List<String> getSastojciNames() {

        List<String> names = new ArrayList<>();
        names.add("Masna kiselina");
        names.add("C vitamin");
        names.add("Proteini");
        return names;
    }

    public static Sastojci getSastojciById(int id) {

        Sastojci a = new Sastojci(0, "apples.jpg", "Masna Kiselina", "Pomaze razvoju pozitivnih bakterija i dobra je za probavu.", null);
        Sastojci b = new Sastojci(1, "bananas.jpg", "C vitamin", "Ojacava imuno sistem",null);
        Sastojci c = new Sastojci(2, "oranges.jpg", "Proteini", "Jacaju misicnu masu.", null);

        switch (id) {
            case 0:
                return new Sastojci(0, "apples.jpg", "Masna Kiselina", "Pomaze razvoju pozitivnih bakterija i dobra je za probavu.", null);
            case 1:
                return new Sastojci(1, "bananas.jpg", "C vitamin", "Ojacava imuno sistem", null);
            case 2:
                return new Sastojci(2, "oranges.jpg", "Proteini", "Jacaju misicnu masu.",null);
            default:
                return null;
        }
    }


}
