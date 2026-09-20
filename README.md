# *Tugas PBO - Sistem Manajemen Data Kendaraan*
NAMA : Daffa Arkhabista\
NIM : 2509116018

## Deskripsi Singkat Program
Program ini dibuat untuk mengelola data kendaraan menggunakan bahasa Java. Program menerapkan konsep OOP dan memiliki fitur CRUD, yaitu Tambah Data, Lihat Data, Ubah Data, dan Hapus Data.

Terdapat tiga class data, yaitu kendaraan, mobil, dan motor. Class kendaraan digunakan sebagai superclass, sedangkan mobil dan motor sebagai subclass.

Data kendaraan disimpan menggunakan ArrayList. Source code terdapat pada folder src/main/java, dengan class utama DataKendaraan.java dan class kendaraan, mobil, serta motor berada di package model.

## *Alur Program*
Saat program dijalankan, pengguna masuk ke menu utama:

1. Tambah Data
2. Lihat Data
3. Ubah Data
4. Hapus Data
5. Keluar

Pada Tambah Data, pengguna memilih jenis kendaraan Mobil atau Motor lalu memasukkan data kendaraan.

Pada Lihat Data, program menampilkan data kendaraan yang sudah tersimpan.

Pada Ubah Data, pengguna memasukkan ID kendaraan kemudian mengubah merk, model, tahun, dan kondisi.

Pada Hapus Data, pengguna memasukkan ID kendaraan yang ingin dihapus.

Program akan terus berjalan sampai pengguna memilih Keluar.

## *Class Hierarchy*
Pada program ini, class kendaraan digunakan sebagai class utama untuk menyimpan data yang umum dimiliki oleh kendaraan. Kemudian ada class mobil dan motor yang dibuat sebagai turunan dari kendaraan.\
Jadi, mobil dan motor masih memiliki data dari kendaraan, tetapi masing-masing juga memiliki data tambahan sesuai jenis kendaraannya.

## *Penerapan Konsep PBO*
1. Inheritance
   
Inheritance digunakan untuk membuat hubungan antara class kendaraan dengan class mobil dan motor.

Pada class mobil terdapat kode:

public class mobil extends kendaraan

Sedangkan pada class motor:

public class motor extends kendaraan

Dengan menggunakan extends, class mobil dan motor dapat menggunakan atribut dan method yang ada pada class kendaraan.

2. Encapsulation

Encapsulation diterapkan dengan membuat atribut pada class menggunakan private, kemudian mengaksesnya melalui getter dan setter.

Contohnya pada class kendaraan:\
private String merk; public String getMerk() { return merk; } public void setMerk(String merk) { this.merk = merk; }

Getter digunakan untuk mengambil nilai, sedangkan setter digunakan untuk mengubah nilai.

3. Constructor

Constructor digunakan untuk memberikan nilai awal pada object saat object dibuat.

Contohnya pada class kendaraan:

public kendaraan(String idKendaraan, String merk, String model, int tahun, String kondisi) {
    this.idKendaraan = idKendaraan;
    this.merk = merk;
    this.model = model;
    this.tahun = tahun;
    this.kondisi = kondisi;
}

Pada class mobil, constructor menggunakan super() untuk memanggil constructor dari class kendaraan.

public mobil(String idKendaraan, String merk, String model, int tahun, String kondisi,
        int jumlahPintu, String jenisBahanBakar) {
    super(idKendaraan, merk, model, tahun, kondisi);
    this.jumlahPintu = jumlahPintu;
    this.jenisBahanBakar = jenisBahanBakar;
}

4. Object dan ArrayList

Object dari class mobil dibuat ketika pengguna menambahkan data kendaraan.

mobil dataMobil = new mobil(
        id, merk, model, tahun, kondisi,
        jumlahPintu, bahanBakar
);

Data tersebut kemudian dimasukkan ke dalam ArrayList.

ArrayList<kendaraan> daftarKendaraan = new ArrayList<>();
daftarKendaraan.add(dataMobil);

ArrayList digunakan untuk menyimpan data kendaraan selama program berjalan.
5. CRUD

Program memiliki empat proses utama, yaitu tambah, lihat, ubah, dan hapus data.

Tambah Data menggunakan add().
Lihat Data menggunakan get() dan perulangan.
Ubah Data menggunakan setter setelah data ditemukan berdasarkan ID.
Hapus Data menggunakan remove() setelah data ditemukan berdasarkan ID.

Contoh proses ubah data:

if (data.getIdKendaraan().equals(idUbah)) {

    data.setMerk(scanner.nextLine());

    data.setModel(scanner.nextLine());

    data.setTahun(scanner.nextInt());
    scanner.nextLine();

    data.setKondisi(scanner.nextLine());
}

6. Percabangan dan Perulangan

Program menggunakan switch untuk menentukan menu yang dipilih pengguna.

switch (pilihan) {
    case 1:
        // Tambah Data
        break;
    case 2:
        // Lihat Data
        break;
    case 3:
        // Ubah Data
        break;
}

if/else digunakan untuk menentukan jenis kendaraan, sedangkan do-while digunakan agar menu terus berjalan sampai pengguna memilih menu Keluar. Perulangan for digunakan untuk mencari dan menampilkan data kendaraan.

## Screenshot Program
1. Tambah Data

Menambahkan data mobil dengan ID 1, merk Brio, model RS, tahun 2026, kondisi bagus, jumlah pintu 4, dan jenis bahan bakar pertalite.\
<img width="268" height="326" alt="Screenshot 2026-09-21 044003" src="https://github.com/user-attachments/assets/45f58e42-87c3-4223-b3c3-b47e7a3cff0a" />

2. Lihat Data

Menampilkan data kendaraan yang sudah berhasil ditambahkan.\
<img width="230" height="320" alt="Screenshot 2026-09-21 044012" src="https://github.com/user-attachments/assets/73bb5623-a407-43f8-acbc-76d20f149b72" />

3. Ubah Data

Data kendaraan ID 1 diubah, yaitu tahun dari 2026 menjadi 2006 dan kondisi dari bagus menjadi rusak kecil. Hasil perubahan ditampilkan kembali.\
<img width="231" height="427" alt="Screenshot 2026-09-21 044053" src="https://github.com/user-attachments/assets/8ecd6061-a205-425a-a99c-f59428b7c4d8" />

4. Hapus Data

Data kendaraan dengan ID 1 dihapus dari daftar kendaraan.\
<img width="187" height="280" alt="Screenshot 2026-09-21 044109" src="https://github.com/user-attachments/assets/e65660d2-d232-41e1-af97-a8fec0086426" />
