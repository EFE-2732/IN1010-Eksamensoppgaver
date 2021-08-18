public class Turgaaer extends Aktivitet {
    int hastighet;
    Kryss sted;

    Turgaaer(int hastighet, Kryss sted){
        this.hastighet = hastighet;
        this.sted = sted;
        tid = 0;
    }

    @Override
    public void handling() {
        Sti sti = sted.tilfeldigSti();
        sted = sti.finnAndreEnde(sted);
        tid = tid + sti.beregnGaaTid(hastighet);
    }
}
