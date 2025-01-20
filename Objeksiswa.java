public class Objeksiswa {
    public static void main(String[] args) {
        siswa siswa = new siswa();

        // Mendapatkan informasi siswa
        System.out.println("Nama: " + siswa.getNama());
        System.out.println("Usia: " + siswa.getUsia());
        System.out.println("Nilai: " + siswa.getNilai());

        // Mengubah nilai siswa
        siswa.setUsia(67);
        siswa.setNilai(98); // Akan gagal karena di luar rentang 0-100

        System.out.println("Usia baru: " + siswa.getUsia());
        System.out.println("Nilai baru: " + siswa.getNilai());
}
}

