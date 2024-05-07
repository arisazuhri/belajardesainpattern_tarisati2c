package latihan_builder;

// Builder Konkret
public class PembangunRumahKonkret implements PembangunRumah {
    private Rumah rumah;

    public PembangunRumahKonkret() {
        this.rumah = new Rumah();
    }

    @Override
    public void bangunPondasi() {
        rumah.setPondasi("Beton");
    }

    @Override
    public void bangunStruktur() {
        rumah.setStruktur("Bata");
    }

    @Override
    public void bangunAtap() {
        rumah.setAtap("Genteng");
    }

    @Override
    public Rumah getRumah() {
        return this.rumah;
    }
}
