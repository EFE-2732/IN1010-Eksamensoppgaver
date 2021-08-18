//da vi kan bruke klasser fra hele javas api i denne oppgaven, tolker jeg det som at det er lov å bruke arraylist.
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Kryss {
    private static int ANTALL_SETER = 4;
    private int ledigeSeter = ANTALL_SETER;

    private Lock laas = new ReentrantLock();
    private Condition ledigPlass = laas.newCondition();

    ArrayList<Sti> stier = new ArrayList<>();

    public void turgaaerKommer() throws InterruptedException{
        laas.lock();
        try {
            while (ledigeSeter==0){
                ledigPlass.await();
            }
            ledigeSeter--;
        } finally {
            laas.unlock();
        }


    }

    public void turgaaerGaar(){
        laas.lock();
        try {
            ledigeSeter++;
            ledigPlass.signal();
        } finally {
            laas.unlock();
        }

    }

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
