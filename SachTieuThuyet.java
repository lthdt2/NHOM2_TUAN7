public class SachTieuThuyet extends Sach {
    private boolean laSachSeries;

    public SachTieuThuyet(String tenSach, String tacGia, int namXuatBan, double giaCoBan, boolean laSachSeries) {
        super(tenSach, tacGia, namXuatBan, giaCoBan);
        this.laSachSeries = laSachSeries;
    }

    @Override
    public double tinhGiaBan() {
        if (laSachSeries) {
            return giaCoBan + 15000;
        } else {
            return giaCoBan;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
               " | Là sách series: " + laSachSeries +
               " | Giá bán: " + tinhGiaBan();
    }
}
