public abstract class Sti {
    int lengde;
    Kryss kryss1;
    Kryss kryss2;
    Sti(int lengde, Kryss kryss1, Kryss kryss2){
        this.lengde = lengde;
        this.kryss1 = kryss1;
        this.kryss2 = kryss2;
    }

    Kryss finnAndreEnde(Kryss start){
        if (start == kryss1){
            return kryss2;
        } else if (start == kryss2){
            return kryss1;
        } else {
            return null;
        }
    }

    int beregnGaaTid(int fart){
        return Math.round((float)lengde/fart);
    }
}
