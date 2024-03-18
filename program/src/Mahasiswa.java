/*Saya Muhammad Muhammad Fadlul Hafiizh [2209889] mengerjakan soal latprak_5 dalam mata kuliah DPBO.
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan, Aamiin */

public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;

    private boolean is_lunas_ukt;

    public Mahasiswa(String nim, String nama, String jenisKelamin, boolean is_lunas_ukt) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.is_lunas_ukt = is_lunas_ukt;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public boolean isIs_lunas_ukt() {
        return is_lunas_ukt;
    }

    public void setIs_lunas_ukt(boolean is_lunas_ukt) {
        this.is_lunas_ukt = is_lunas_ukt;
    }
}
