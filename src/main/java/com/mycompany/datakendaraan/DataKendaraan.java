package com.mycompany.datakendaraan;

import java.util.ArrayList;
import java.util.Scanner;
import model.kendaraan;
import model.mobil;
import model.motor;

public class DataKendaraan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<kendaraan> daftarKendaraan = new ArrayList<>();

        int pilihan;

        do {
            System.out.println("\n=== DATA KENDARAAN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== TAMBAH DATA ===");
                    System.out.println("1. Mobil");
                    System.out.println("2. Motor");
                    System.out.print("Pilih jenis kendaraan: ");
                    int jenis = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("ID Kendaraan: ");
                    String id = scanner.nextLine();

                    System.out.print("Merk: ");
                    String merk = scanner.nextLine();

                    System.out.print("Model: ");
                    String model = scanner.nextLine();

                    System.out.print("Tahun: ");
                    int tahun = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Kondisi: ");
                    String kondisi = scanner.nextLine();

                    if (jenis == 1) {
                        System.out.print("Jumlah Pintu: ");
                        int jumlahPintu = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Jenis Bahan Bakar: ");
                        String bahanBakar = scanner.nextLine();

                        mobil dataMobil = new mobil(
                                id, merk, model, tahun, kondisi,
                                jumlahPintu, bahanBakar
                        );

                        daftarKendaraan.add(dataMobil);

                        System.out.println("Data mobil berhasil ditambahkan.");

                    } else if (jenis == 2) {
                        System.out.print("Jenis Motor: ");
                        String jenisMotor = scanner.nextLine();

                        System.out.print("Kapasitas Mesin: ");
                        int kapasitasMesin = scanner.nextInt();
                        scanner.nextLine();

                        motor dataMotor = new motor(
                                id, merk, model, tahun, kondisi,
                                jenisMotor, kapasitasMesin
                        );

                        daftarKendaraan.add(dataMotor);

                        System.out.println("Data motor berhasil ditambahkan.");

                    } else {
                        System.out.println("Jenis kendaraan tidak tersedia.");
                    }
                    break;

                case 2:
                    System.out.println("\n=== DATA KENDARAAN ===");

                    if (daftarKendaraan.size() == 0) {
                        System.out.println("Belum ada data kendaraan.");
                    } else {
                        for (int i = 0; i < daftarKendaraan.size(); i++) {
                            kendaraan data = daftarKendaraan.get(i);

                            System.out.println("\nData ke-" + (i + 1));
                            System.out.println("ID       : " + data.getIdKendaraan());
                            System.out.println("Merk     : " + data.getMerk());
                            System.out.println("Model    : " + data.getModel());
                            System.out.println("Tahun    : " + data.getTahun());
                            System.out.println("Kondisi  : " + data.getKondisi());

                            if (data instanceof mobil) {
                                mobil dataMobil = (mobil) data;

                                System.out.println("Jenis    : Mobil");
                                System.out.println("Pintu    : " + dataMobil.getJumlahPintu());
                                System.out.println("Bahan Bakar : " + dataMobil.getJenisBahanBakar());

                            } else if (data instanceof motor) {
                                motor dataMotor = (motor) data;

                                System.out.println("Jenis    : Motor");
                                System.out.println("Jenis Motor : " + dataMotor.getJenisMotor());
                                System.out.println("Mesin    : " + dataMotor.getKapasitasMesin() + " cc");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== UBAH DATA ===");
                    System.out.print("Masukkan ID kendaraan: ");
                    String idUbah = scanner.nextLine();

                    for (int i = 0; i < daftarKendaraan.size(); i++) {
                        kendaraan data = daftarKendaraan.get(i);

                        if (data.getIdKendaraan().equals(idUbah)) {
                            System.out.print("Merk baru: ");
                            data.setMerk(scanner.nextLine());

                            System.out.print("Model baru: ");
                            data.setModel(scanner.nextLine());

                            System.out.print("Tahun baru: ");
                            data.setTahun(scanner.nextInt());
                            scanner.nextLine();

                            System.out.print("Kondisi baru: ");
                            data.setKondisi(scanner.nextLine());

                            System.out.println("Data berhasil diubah.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n=== HAPUS DATA ===");
                    System.out.print("Masukkan ID kendaraan: ");
                    String idHapus = scanner.nextLine();

                    for (int i = 0; i < daftarKendaraan.size(); i++) {
                        kendaraan data = daftarKendaraan.get(i);

                        if (data.getIdKendaraan().equals(idHapus)) {
                            daftarKendaraan.remove(i);

                            System.out.println("Data berhasil dihapus.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilihan != 5);
    }
}