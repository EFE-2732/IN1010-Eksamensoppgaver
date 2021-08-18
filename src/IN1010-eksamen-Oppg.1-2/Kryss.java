//da vi kan bruke klasser fra hele javas api i denne oppgaven, tolker jeg det som at det er lov å bruke arraylist.
import java.util.ArrayList;

public class Kryss {
    ArrayList<Sti> stier = new ArrayList<>();

    public void leggTilSti(Sti sti){
        stier.add(sti);
    }

    public Sti tilfeldigSti(){
        return stier.get(Trekk.trekkInt(0, stier.size()));
    }

    public Boolean isolert(){
        return stier.size() == 0;
    }
}
