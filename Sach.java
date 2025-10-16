public class Sach {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected double giaCoBan;

    public Sach() {
    }

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, double giaCoBan) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.giaCoBan = giaCoBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getGiaCoBan() {
        return giaCoBan;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }
    public double tinhGiaBan() {
        return giaCoBan;
    }
    public void hienThiThongTin() {
        System.out.println("---------------------------------");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
        System.out.println("Gia co ban: " + giaCoBan);
        System.out.println("Gia ban: " + tinhGiaBan());
    }

    @Override
    public String toString() {
        return "Ma sach: " + maSach +
                ", Ten: " + tieuDe +
                ", Tac gia: " + tacGia +
                ", Nam XB: " + namXuatBan +
                ", SL: " + soLuong +
                ", Gia co ban: " + giaCoBan +
                ", Gia ban: " + tinhGiaBan();
    }
}
