
import java.util.ArrayList;
import java.util.Scanner;

class PemilikSIM{

    private String nama;
    private String tglLahir;
    private String tempatLahir;
    private String golDarah;
    private String jenisKelamin;
    private String alamat;
    private String tglKadaluarsa;
    private String jenisSIM;
    private String kotaTerbit;

    public PemilikSIM(String nama, String tglLahir, String tempatLahir, String golDarah, String jenisKelamin, String alamat, String tglKadaluarsa, String jenisSIM, String kotaTerbit){
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tempatLahir = tempatLahir;
        this.golDarah = golDarah;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.tglKadaluarsa = tglKadaluarsa;
        this.jenisSIM = jenisSIM;
        this.kotaTerbit = kotaTerbit;
    }

    public String getNama(){
        return nama;
    }

    public String getJenisSIM(){
        return jenisSIM;
    }

    public String getDataLengkap(){
        return "Nama              : " + nama + "\nTempat Lahir      : " + tempatLahir + "\nTanggal Lahir     : " + tglLahir
                + "\nGolongan Darah    : " + golDarah + "\nJenis Kelamin     : " + jenisKelamin + "\nAlamat            : " +
                 alamat + "\nJenis SIM         : " + jenisSIM + "\nTanggal Kadaluarsa: " + tglKadaluarsa + 
                 "\nKota Penerbit     : " + kotaTerbit;
    }
}

public class Mandiri1 {
    Scanner input = new Scanner(System.in);
    ArrayList<PemilikSIM> dataSIM = new ArrayList<>();

    public static void main(String[] args) {
        Mandiri1 app = new Mandiri1();
        app.menu();
    }

    void menu() {
        int pilih;
        do {
            System.out.println("\n=== MENU DATA SIM ===");
            System.out.println("1. Input Data SIM");
            System.out.println("2. Tampilkan Nama & Jenis SIM");
            System.out.println("3. Tampilkan Data Lengkap");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu : ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 :
                    inputData();
                case 2 :
                    tampilSingkat();
                case 3 :
                    tampilLengkap();
                case 4 :
                    System.out.println("Terima kasih");
                // default :
                //     System.out.println(" ");
            }
        } while (pilih != 4);
    }

    void inputData() {
        System.out.print("Nama              : ");
        String nama = input.nextLine();
        System.out.print("Tempat Lahir      : ");
        String tempat = input.nextLine();
        System.out.print("Tanggal Lahir     : ");
        String tglLahir = input.nextLine();
        System.out.print("Golongan Darah    : ");
        String golDarah = input.nextLine();
        System.out.print("Jenis Kelamin     : ");
        String jk = input.nextLine();
        System.out.print("Alamat            : ");
        String alamat = input.nextLine();
        System.out.print("Jenis SIM (A/B/C) : ");
        String jenisSIM = input.nextLine();
        System.out.print("Tanggal Kadaluarsa: ");
        String tglKadaluarsa = input.nextLine();
        System.out.print("Kota Penerbit     : ");
        String kota = input.nextLine();

        dataSIM.add(new PemilikSIM(nama, tglLahir, tempat, golDarah, jk, alamat, tglKadaluarsa, jenisSIM, kota));
        System.out.println("Data SIM berhasil ditambahkan");
    }

    
    void tampilSingkat() {
        System.out.println("\nDaftar Pemilik SIM");
        for (int i = 0; i < dataSIM.size(); i++) {
            System.out.println((i + 1) + ". " + dataSIM.get(i).getNama() + " - SIM " + dataSIM.get(i).getJenisSIM());
        }
    }

    void tampilLengkap() {
        tampilSingkat();
        System.out.print("\nPilih nomor data: ");
        int pilih = input.nextInt();

        if (pilih > 0 && pilih <= dataSIM.size()) {
            System.out.println("\n=== DATA LENGKAP ===");
            System.out.println(dataSIM.get(pilih - 1).getDataLengkap());
        } else {
            System.out.println("Salahh bangg ee lah");
        }
    }
}
