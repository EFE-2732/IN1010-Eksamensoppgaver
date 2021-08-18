public class PrioKo {
    private Aktivitet foerste;
    private Aktivitet siste;

    //jeg antar at elementet skal fjernes når det hentes ut
    public Aktivitet hentUt(){
        try{
            return foerste;
        } finally {
            if (foerste != null){
                if (foerste == siste){
                    foerste = null;
                    siste = null;
                } else {
                    foerste = foerste.hoyere;
                    foerste.lavere = null;
                }
            }
        }
    }

    public void settInn(Aktivitet a){
        if (siste == null){
            foerste = a;
            siste = a;
        } else {
            Aktivitet current = siste;
            while (!(current==foerste) && a.compareTo(current)>0){
                current = current.lavere;
            }


            a.hoyere=current.hoyere;
            a.lavere=current;

            if (current == siste){
                siste = a;
            } else {
                current.hoyere.lavere=a;
            }
            current.hoyere=a;

        }
    }
}
