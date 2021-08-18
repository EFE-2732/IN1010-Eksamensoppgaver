public class TestSimulator {
    public static void main(String[] args) {
        int antTurgaaere = 13;

        Skog skog = new Skog(10, 5);
        Turgaaer[] turgaaere = new Turgaaer[antTurgaaere];
        for (int i = 0; i < antTurgaaere; i++) {
            turgaaere[i] = new Turgaaer(Trekk.trekkInt(20, 200), skog.hentTilfeldigStart());
        }

        Simulator simulator = new Simulator(turgaaere);
        simulator.simuler(Trekk.trekkInt(30, 480));
    }
}
