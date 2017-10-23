package rs.aleph.android.example15.model;

import java.util.ArrayList;
import java.util.List;

public class Categoryjelo {

    private int id;
    private String name;
    private List<Jelo> jela;

    public Categoryjelo() {

        jela = new ArrayList<>();
    }

    public Categoryjelo(int id, String name) {

        this.id = id;
        this.name = name;

        jela = new ArrayList<>();
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

    public void addjela(Jelo jelo) {

        jela.add(jelo);
    }

    public void removeJelo(Jelo jelo) {

        jela.remove(jelo);
    }

    public Jelo getJelo(int position) {

        return jela.get(position);
    }

    public Jelo<jela> getjela() {

        return jela;
    }

    public void setjela(List<Jelo> jela) {

        this.jela = jela;
    }
}
