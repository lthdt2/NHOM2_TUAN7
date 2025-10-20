public abstract class Sach {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public String getMaSach() { return maSach; }
    public void setMaSach(String maSach) { this.maSach = maSach; }

    public double getGiaCoBan() { return giaCoBan; }
    public void setGiaCoBan(double giaCoBan) { this.giaCoBan = giaCoBan; }

    public abstract double tinhGiaBan();

    @Override
    public String toString() {
        return "Mã sách: " + maSach +
               ", Tiêu đề: " + tieuDe +
               ", Tác giả: " + tacGia +
               ", Năm xuất bản: " + namXuatBan +
               ", Số lượng: " + soLuong +
               ", Giá cơ bản: " + giaCoBan;
    }
}