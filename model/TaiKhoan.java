package model;

public class TaiKhoan {
    String tenTaiKhoan;
    String matKhau;
    String tenKhachHang;
    String gioiTinh;
    String soDienThoai;
    String email;
    String ngaySing;
    String diaChi;
    String soLuotMua;
    String role;

    public TaiKhoan(String tenTaiKhoan, String matKhau, String tenKhachHang, String gioiTinh, String soDienThoai, String email, String ngaySing, String diaChi, String soLuotMua, String role) {
        this.tenTaiKhoan = tenTaiKhoan;
        this.matKhau = matKhau;
        this.tenKhachHang = tenKhachHang;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.ngaySing = ngaySing;
        this.diaChi = diaChi;
        this.soLuotMua = soLuotMua;
        this.role = role;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgaySing() {
        return ngaySing;
    }

    public void setNgaySing(String ngaySing) {
        this.ngaySing = ngaySing;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoLuotMua() {
        return soLuotMua;
    }

    public void setSoLuotMua(String soLuotMua) {
        this.soLuotMua = soLuotMua;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
