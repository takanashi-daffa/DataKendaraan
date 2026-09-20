package model;

public class mobil extends kendaraan {
    private int jumlahPintu;
    private String jenisBahanBakar;

    public mobil(String idKendaraan, String merk, String model, int tahun, String kondisi,
            int jumlahPintu, String jenisBahanBakar) {
        super(idKendaraan, merk, model, tahun, kondisi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }

    public void setJenisBahanBakar(String jenisBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
    }
}