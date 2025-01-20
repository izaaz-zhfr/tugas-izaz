import java.util.Scanner;
public class siswa {
    // Atribut private
    private String nama;
    private int usia;
    private double nilai;

    // Constructor untuk inisialisasi objek
    public siswa() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Siapa nama kalian?");
            this.nama = input.nextLine();

            // Validasi untuk usia
            while (true) {
                System.out.println("Berapa usia kalian?");
                this.usia = input.nextInt();
                if (this.usia > 0) {
                    break;
                } else {
                    System.out.println("Usia harus lebih dari 0. Silakan masukkan usia yang valid.");
                }
            }

            // Validasi untuk nilai
            while (true) {
                System.out.println("Berapa nilai kalian?");
                this.nilai = input.nextDouble();
                if (this.nilai >= 0 && this.nilai <= 100) {
                    break;
                } else {
                    System.out.println("Nilai harus berada di antara 0 dan 100. Silakan masukkan nilai yang valid.");
                }
            }
            input.nextLine(); // Bersihkan buffer
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan pada input. Silakan coba lagi.");
        }
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk usia
    public int getUsia() {
        return usia;
    }

    // Setter untuk usia (hanya menerima nilai lebih dari 0)
    public void setUsia(int usia) {
        if (usia > 0) {
            this.usia = usia;
        } else {
            System.out.println("Usia harus lebih dari 0.");
        }
    }

    // Getter untuk nilai
    public double getNilai() {
        return nilai;
    }

    // Setter untuk nilai (hanya menerima nilai antara 0 dan 100)
    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai harus berada di antara 0 dan 100.");
        }
    }

    // Method untuk menampilkan informasi siswa
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Nilai: " + nilai);
    }

    public static void main(String[] args) {
        siswa siswa = new siswa();
        siswa.displayInfo();
}
}