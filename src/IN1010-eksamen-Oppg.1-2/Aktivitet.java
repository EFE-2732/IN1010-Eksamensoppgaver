public abstract class Aktivitet implements Comparable<Aktivitet>{
    Aktivitet lavere;
    Aktivitet hoyere;
    int tid;
    public abstract void handling();

    @Override
    public int compareTo(Aktivitet a){
        return a.tid-tid;
    }
}
