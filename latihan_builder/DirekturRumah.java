package latihan_builder;

// Direktur (opsional)
public class DirekturRumah {
    private PembangunRumah builder;

    public void setBuilder(PembangunRumah builder) {
        this.builder = builder;
    }

    public Rumah konstruksi() {
        builder.bangunPondasi();
        builder.bangunStruktur();
        builder.bangunAtap();
        return builder.getRumah();
    }
}
