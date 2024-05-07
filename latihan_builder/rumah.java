package latihan_builder;

// Produk
 class Rumah {
    private String pondasi;
    private String struktur;
    private String atap;

    // konstruktor
    public Rumah() {
        this.pondasi = "";
        this.struktur = "";
        this.atap = "";
    }

    // getter dan setter untuk pondasi
    public String getPondasi() {
        return pondasi;
    }

    public void setPondasi(String pondasi) {
        this.pondasi = pondasi;
    }

    // getter dan setter untuk struktur
    public String getStruktur() {
        return struktur;
    }

    public void setStruktur(String struktur) {
        this.struktur = struktur;
    }

    // getter dan setter untuk atap
    public String getAtap() {
        return atap;
    }

    public void setAtap(String atap) {
        this.atap = atap;
    }

    // Override toString() untuk menampilkan informasi rumah
    @Override
    public String toString() {
        return "Rumah{" +
                "pondasi='" + pondasi + '\'' +
                ", struktur='" + struktur + '\'' +
                ", atap='" + atap + '\'' +
                '}';
    }
}
