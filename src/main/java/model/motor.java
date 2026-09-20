package model;

public class motor extends kendaraan {
    private String jenisMotor;
    private int kapasitasMesin;

    public motor(String idKendaraan, String merk, String model, int tahun, String kondisi,
            String jenisMotor, int kapasitasMesin) {
        super(idKendaraan, merk, model, tahun, kondisi);
        this.jenisMotor = jenisMotor;
        this.kapasitasMesin = kapasitasMesin;
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }
}