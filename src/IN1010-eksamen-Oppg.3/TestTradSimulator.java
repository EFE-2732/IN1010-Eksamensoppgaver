public class TestTradSimulator {
    public static void main(String[] args) {
        int antTurgaaere = 13;

        Skog skog = new Skog(10, 5);

        Thread[] threads = new Thread[antTurgaaere];

        for (int i = 0; i < antTurgaaere; i++) {
            threads[i] = new Thread(new Turgaaer(Trekk.trekkInt(20, 200), skog.hentTilfeldigStart()));
            threads[i].start();
        }

        //maks simuleringstid "minutter". set til 0 hvis uendelig.
        int T = 10;

        if (T<=0){
            try {
                Thread.sleep(T*1000);
            } catch (InterruptedException ignored){
            }
            for(Thread t:threads){
                t.interrupt();
            }
        }



    }
}
