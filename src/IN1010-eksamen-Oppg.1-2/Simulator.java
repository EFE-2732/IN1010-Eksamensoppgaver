public class Simulator {
    int globaltid = 0;
    PrioKo prioKo;

    Simulator(Aktivitet[] aktiviteter){
        prioKo = new PrioKo();
        for (Aktivitet a : aktiviteter){
            prioKo.settInn(a);
        }
    }

    public void simuler(int t){
        while (globaltid<t){
            Aktivitet aktivitet = prioKo.hentUt();
            globaltid = aktivitet.tid;
            aktivitet.handling();
            prioKo.settInn(aktivitet);
        }
    }
}
