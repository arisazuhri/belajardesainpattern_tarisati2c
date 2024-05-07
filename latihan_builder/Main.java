package latihan_builder;

// Kode klien
public class Main {
    public static void main(String[] args) {
        // Membuat objek builder konkret
        PembangunRumah builder = new PembangunRumahKonkret();

        // Membuat objek direktur
        DirekturRumah direktur = new DirekturRumah();
        direktur.setBuilder(builder); // Menetapkan builder yang digunakan oleh direktur

        // Meminta direktur untuk membangun rumah
        Rumah rumah = direktur.konstruksi();

        // Menampilkan informasi tentang rumah yang telah dibangun
        System.out.println("Rumah yang telah dibangun:");
        System.out.println("Pondasi = " + rumah.getPondasi());
        System.out.println("Struktur = " + rumah.getStruktur());
        System.out.println("Atap = " + rumah.getAtap());
    }
}
