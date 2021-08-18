public class Skog {
    Kryss[] kryss;
    int ANTKRYSS;
    Skog(int ANTSTIER, int ANTKRYSS){
        this.ANTKRYSS = ANTKRYSS;
        kryss = new Kryss[ANTKRYSS];
        for (int i = 0; i<ANTKRYSS; i++){
            kryss[i] = new Kryss();
        }

        for (int i = 0; i<ANTSTIER; i++){
            Kryss kryss1 = hentTilfeldigKryss();
            Kryss kryss2 = hentTilfeldigKryss();
            int lengde = Trekk.trekkInt(220, 2500);
            Sti sti;

            int rand = Trekk.trekkInt(0,3);

            if(rand==0){
                sti = new Natursti(lengde, kryss1, kryss2);
            } else if (rand == 1){
                sti = new NaturstiMedGodUtsikt(lengde, kryss1, kryss2, Trekk.trekkInt(1,6));
            } else if (rand == 2){
                sti = new Kjerrevei(lengde, kryss1, kryss2);
            } else {
                sti = new KjerreveiMedGodUtsikt(lengde, kryss1, kryss2, Trekk.trekkInt(1,6));
            }
            kryss1.leggTilSti(sti);
            kryss2.leggTilSti(sti);
        }
    }
    public Kryss hentTilfeldigKryss(){
        return kryss[Trekk.trekkInt(0, ANTKRYSS-1)];
    }

    public Kryss hentTilfeldigStart(){
        int index = Trekk.trekkInt(0,ANTKRYSS-1);
        for (int i = 0; i<ANTKRYSS-1;i++){
            if (!kryss[(i+index)%ANTKRYSS].isolert()){
                return kryss[(i+index)%ANTKRYSS];
            }
        }
        return null;
    }
}
