public abstract class StiMedGodUtsikt extends Sti implements GodUtsikt{
    //jeg har endret klassehirearkiet siden oppgave 1a, for å bedre følge dry-prinsippet.
    private int utsikt;
    StiMedGodUtsikt(int lengde, Kryss kryss1, Kryss kryss2, int utsikt) {
        super(lengde, kryss1, kryss2);
        if (1<=utsikt && utsikt<=6) {
            this.utsikt = utsikt;
        } else {
            throw new BadViewIntException(utsikt);
        }
    }

    @Override
    public int hvorGodUtsikt(int utsikt) {
        return utsikt;
    }
}
