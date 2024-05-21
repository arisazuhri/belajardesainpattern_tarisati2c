// Kelas Utama untuk Demonstrasi Penggunaan
class Mainn {
    public static void main(String[] args) {
        try {
            BookRepo bookRepo = new BookRepoImpl(); // Implementasi BookRepo
            BookSummaryService summaryService = new BookSummaryService(bookRepo);

            // Gunakan nilai pengelompokan yang sesuai dengan data yang ada
            BookReq reqKategori = new BookReq("kategori", "Fiksi");
            summaryService.printSummary(reqKategori);

            BookReq reqTanggalRilis = new BookReq("tanggalRilis", "2023-01-01");
            summaryService.printSummary(reqTanggalRilis);

            BookReq reqPenulis = new BookReq("penulis", "Penulis A");
            summaryService.printSummary(reqPenulis);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}