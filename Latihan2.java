
import java.util.ArrayList;
import java.util.Scanner;

class Rekening {

    private int no;
    private String nama;
    private double saldo;

    public Rekening(String nama, int no, double saldo) {        //No 1,2,3
        this.no = no;                       //No 4
        this.nama = nama;                       //No 5
        this.saldo = saldo;                     //No 6
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {                      //No 8
        return saldo;
    }

    public int getNo() {                        //No 9
        return no;
    }

    public String getNama() {                       //No 10
        return nama;
    }
}

class Latihan2 {

    ArrayList<Rekening> aRek = new ArrayList<>();           //No 11
    double saldoMinimal = 50000;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] abcd) {
        Latihan2 b = new Latihan2();
        b.menu();
    }

    private void menu() {
        while (true) {
            System.out.println("\n=== MENU BANK ===");
            System.out.println("1. Buat Rekening");
            System.out.println("2. Tabung");
            System.out.println("3. Tarik");
            System.out.println("4. Transfer");
            System.out.println("5. Info Rekening");
            System.out.println("6. Exit");
            System.out.print("Pilih: ");
            int p = sc.nextInt();

            switch (p) {
                case 1:
                    buatRekening();
                    break;
                case 2:
                    tabung();
                    break;
                case 3:
                    tarik();
                    break;
                case 4:
                    transfer();
                    break;
                case 5:
                    System.out.print("Masukkan no rekening: ");
                    int no = sc.nextInt();
                    infoRekening(no);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    private void buatRekening() {
        System.out.print("Nama: ");
        String nama = sc.next();
        System.out.print("Saldo awal: ");
        double saldo = sc.nextDouble();

        if (saldo < saldoMinimal) {
            System.out.println("Saldo awal tidak mencukupi");
            return;
        }

        int no;
        if (!aRek.isEmpty()) {
            no = aRek.get(aRek.size() - 1).getNo() + 1;
        } else {
            no = 1;
        }

        Rekening rek = new Rekening(nama, no, saldo);
        aRek.add(rek);                  //No 13
        System.out.println("Rekening telah ditambahkan");
    }

    private int cekRekening(int no) {
        int ketemu = -1;
        for (int a = 0; a < aRek.size(); a++) {
            if (aRek.get(a).getNo() == no) {            //No 14
                ketemu = a;
                break;
            }
        }
        return ketemu;
    }

    private void tabung() {
        System.out.print("No rekening: ");
        int noRek = sc.nextInt();
        System.out.print("Jumlah: ");
        double jumlah = sc.nextDouble();

        int pos = cekRekening(noRek);
        if (pos >= 0) {
            double saldoAkhir = aRek.get(pos).getSaldo() + jumlah;
            aRek.get(pos).setSaldo(saldoAkhir);             //No 15
            System.out.println("Transaksi selesai");
        } else {
            System.out.println("No Rekening tidak ditemukan, Transaksi dibatalkan");
        }
    }

    private void tarik() {
        System.out.print("No rekening: ");
        int noRek = sc.nextInt();
        System.out.print("Jumlah: ");
        double jumlah = sc.nextDouble();

        int pos = cekRekening(noRek);
        if (pos >= 0) {
            double saldoAkhir = aRek.get(pos).getSaldo() - jumlah;
            if (saldoAkhir >= saldoMinimal) {               //No 16
                aRek.get(pos).setSaldo(saldoAkhir);
                System.out.println("Transaksi Selesai");
            } else {
                System.out.println("Saldo tidak cukup");
            }
        } else {
            System.out.println("No Rekening tidak ditemukan, Transaksi dibatalkan");
        }
    }

    private void transfer() {
        System.out.print("No rekening asal: ");
        int noAsal = sc.nextInt();
        System.out.print("No rekening tujuan: ");
        int noTujuan = sc.nextInt();
        System.out.print("Jumlah: ");
        double jumlah = sc.nextDouble();

        int posAsal = cekRekening(noAsal);              //No 18
        int posTujuan = cekRekening(noTujuan);              //No 19
        if ((posAsal >= 0) && (posTujuan >= 0)) {
            double saldoAkhirAsal = aRek.get(posAsal).getSaldo() - jumlah;
            if (saldoAkhirAsal >= saldoMinimal) {
                aRek.get(posAsal).setSaldo(saldoAkhirAsal);         //No 20
                double saldoAkhirTujuan = aRek.get(posTujuan).getSaldo() + jumlah;  //No 21
                aRek.get(posTujuan).setSaldo(saldoAkhirTujuan);
                System.out.println("Transfer telah dilaksanakan");
            } else {
                System.out.println("Saldo tidak cukup, Transaksi dibatalkan");
            }
        } else {
            System.out.println("No Rekening tidak ditemukan");
        }
    }

    private void infoRekening(int no) {
        int pos = cekRekening(no);
        if (pos >= 0) {
            System.out.println("Informasi Rekening");
            System.out.println("No Rek : " + aRek.get(pos).getNo());            //No 23
            System.out.println("Nama   : " + aRek.get(pos).getNama());          //No 24
            System.out.println("Saldo  : " + aRek.get(pos).getSaldo());         //No 25
        }
    }
}
