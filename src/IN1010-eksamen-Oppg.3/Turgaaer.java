public class Turgaaer implements Runnable {
    int hastighet;
    Kryss sted;

    Turgaaer(int hastighet, Kryss sted){
        this.hastighet = hastighet;
        this.sted = sted;
    }


    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Sti sti = sted.tilfeldigSti();
                sted = sti.finnAndreEnde(sted);
                //går
                Thread.sleep(sti.beregnGaaTid(hastighet)*1000);
                sted.turgaaerKommer();
                //hviler
                Thread.sleep(Trekk.trekkInt(1, 5)*1000);
                sted.turgaaerGaar();
            }
        } catch (InterruptedException ignored){

        }
    }
}
