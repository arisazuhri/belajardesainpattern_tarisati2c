analisa program

1. membuat kelas arraylist dan list dari paket java.util.
2. kelas ini adalah subjec dalam pola observable.
3. mempunyai atribut state yang mempresentasikan keadaan(state) yang akan diamati.
4. metode getstate() mengembalikan nilai state.
5. metode setstate() mengatur nilai state dan memanggil notifyAllObserser() untuk memberitahu semua observer tentang perubahan.
6. metode attach() menambahkan observer baru ke dalam daftar pengamat.
7. metode notifyALLObservers() mengirim notifikasi untuk semua observer dalam daftar.
8. interface ini mendefinisikan metode update() yang akan dipanggil oleh subjek ketika terjadi perubahan.
9. setiap kelas pada observer konkret yang mengimplementasikan metode update() dari interface observer.
10. construktor menerima objek subjek(observable) dan menyematkan observer kedalam subjek.
11. metode update() akan dipanggil oleh subjek saat ada perubahan pada keadaan dan akan memcetak representasi keadaan format yang sesuai (biner,oktel,heksadesimal).
12. pada deklarasi kelas utama yang akan digunakan sebagai titik masuk (entry point) untuk program.
13. ini adalah metode utama yang akan di eksekusi ketika program dimulai.
14. membuat objek dari kelas observable yang akan digunakan sebagai subjek dalam pola observable.
15. membuat 3 observer baru (binary observer, oktalobserver, dan hexaobserver) yang disematkan ke objek subjek(observable) yang sama.
16. mengatur nilai state menjadi 15.
17. karena terjadi perubahan pada state, subjek akan memberitahu semua observer tentang perubahan tersebut.
18. mengatur nilai state subjek menjadi 10.
19. kembali, subjek akan memberitahu semua observer tentang perubahan baru ini.