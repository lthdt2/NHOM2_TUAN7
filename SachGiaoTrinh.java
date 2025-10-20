public class SachGiaoTrinh extends Sach {

    public SachGiaoTrinh(String tenSach, String tacGia, int namXuatBan, double giaCoBan) {
        super(tenSach, tacGia, namXuatBan, giaCoBan);
    }

    @Override
    public double tinhGiaBan() {
        int soNam = 2025 - namXuatBan;
        return giaCoBan + (soNam * 5000);
    }

    @Override
    public String toString() {
        return super.toString() + " | Giá bán: " + tinhGiaBan();
    }
}
