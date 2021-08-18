public abstract class Aktivitet2 implements Comparable<Aktivitet2>{
    Aktivitet2 lavere;
    Aktivitet2 hoyere;
    int tid;
    public abstract void handling();

    //jeg har her metoder som innkapsler tid-variabelen og sikrer at den ikke settes lavere enn det den var.
    public void laTidenGaa(int tid){
        assert tid>=0;
        this.tid = this.tid+tid;
    }
    public int getTid(){
        return tid;
    }

    @Override
    public int compareTo(Aktivitet2 a){
        return a.tid-tid;
    }
}
