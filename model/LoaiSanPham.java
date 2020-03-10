package model;

public class LoaiSanPham {
    String maLoai;
    String tenLoai;
    String maNhaCungCap;
    String moTa;

    public LoaiSanPham(String maLoai, String tenLoai, String maNhaCungCap, String moTa) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.maNhaCungCap = maNhaCungCap;
        this.moTa = moTa;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
