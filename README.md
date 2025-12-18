# Praktikum-Week-12
## ArrayList – Java 

## 📌 Deskripsi

Repositori ini berisi implementasi **praktikum penggunaan ArrayList pada Java** yang bertujuan untuk memahami pengelolaan data dinamis menggunakan konsep **Object Oriented Programming (OOP)**. Studi kasus utama yang digunakan adalah **pendataan mahasiswa**, disertai latihan lanjutan berupa **sistem perbankan sederhana**.

## 🎯 Tujuan Praktikum

* Memahami konsep **ArrayList** sebagai struktur data dinamis
* Menerapkan **kelas entitas** dan **kelas driver**
* Mengelola data menggunakan operasi tambah, akses, dan tampil
* Melatih pemahaman logika program berbasis kasus nyata

## 🧑‍🎓 Studi Kasus 1: Pendataan Mahasiswa

Aplikasi digunakan untuk menyimpan dan menampilkan data mahasiswa dengan atribut:

* NIM
* Nama

Karena jumlah mahasiswa tidak ditentukan, data disimpan menggunakan:

```java
ArrayList<Mahasiswa>
```

### Implementasi

* **Kelas Mahasiswa**

  * Menyimpan data mahasiswa
  * Menyediakan method getter dan setter
* **Kelas DriverMahasiswa**

  * Menerima input data mahasiswa
  * Menyimpan data ke dalam ArrayList
  * Menampilkan data mahasiswa

## 🏦 Studi Kasus 2: Sistem Perbankan Sederhana

Latihan lanjutan berupa aplikasi perbankan dengan fitur:

* Pembuatan rekening baru
* Setor saldo (tabung)
* Penarikan saldo (tarik) dengan batas saldo minimal
* Transfer antar rekening
* Informasi rekening

Struktur data rekening disimpan menggunakan:

```java
ArrayList<Rekening>
```

Latihan ini bertujuan untuk memperdalam pemahaman ArrayList dalam pengelolaan data yang lebih kompleks.

## 📝 Tugas Mandiri

Pengembangan aplikasi **Pendataan Kepemilikan SIM** dengan atribut:

* Nama
* Tempat & tanggal lahir
* Golongan darah
* Jenis kelamin
* Alamat
* Jenis SIM (A/B/C)
* Tanggal kadaluarsa SIM
* Kota penerbitan SIM

### Fitur:

* Input data pemilik SIM
* Menampilkan daftar pemilik SIM (nama & jenis SIM)
* Menampilkan data lengkap berdasarkan pilihan pengguna

## 🧩 Penjelasan Singkat Kode

* **ArrayList** digunakan untuk menyimpan data secara dinamis tanpa batas jumlah tertentu.
* **Kelas Entitas** (seperti `Mahasiswa` dan `Rekening`) berfungsi sebagai wadah data dan menyediakan method *getter* dan *setter*.
* **Kelas Driver / Main** bertugas menjalankan program, menerima input dari pengguna, memproses data, serta menampilkan hasil.
* Method `add()` digunakan untuk menambahkan data ke ArrayList, sedangkan `get()` digunakan untuk mengambil data berdasarkan indeks.

Penulisan kode mengikuti konsep **Object Oriented Programming (OOP)** agar program lebih terstruktur dan mudah dikembangkan.

### 📌 Contoh Potongan Kode

Berikut contoh sederhana penggunaan `ArrayList` untuk menyimpan data mahasiswa:

```java
ArrayList<Mahasiswa> arrMhs = new ArrayList<>();

// menambahkan data mahasiswa
arrMhs.add(new Mahasiswa(12345, "Andi"));
arrMhs.add(new Mahasiswa(12346, "Budi"));

// menampilkan data mahasiswa
for (int i = 0; i < arrMhs.size(); i++) {
    System.out.println(
        arrMhs.get(i).getNim() + " - " + arrMhs.get(i).getNama()
    );
}
```

Contoh di atas menunjukkan proses **menyimpan** dan **menampilkan data** menggunakan ArrayList.

## 🛠️ Teknologi

* Bahasa Pemrograman: **Java**
* Konsep: **OOP & ArrayList**

## 📂 Catatan

Proyek ini dibuat sebagai bagian dari **praktikum dan latihan mata kuliah Algoritma & Pemrograman**.

---

✍️ *Dibuat untuk keperluan pembelajaran dan latihan pemrograman Java.*
