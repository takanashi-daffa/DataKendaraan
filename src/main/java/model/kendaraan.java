package model;

public class kendaraan {
    private String idKendaraan;
    private String merk;
    private String model;
    private int tahun;
    private String kondisi;

    public kendaraan(String idKendaraan, String merk, String model, int tahun, String kondisi) {
        this.idKendaraan = idKendaraan;
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.kondisi = kondisi;
    }

    public String getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
}