import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public void xoaSach(String maSach) {
        Sach s = timSachTheoMa(maSach);
        if (s != null) {
            danhSach.remove(s);
            System.out.println("Da xoa sach co ma: " + maSach);
        } else {
            System.out.println("Khong tim thay sach de xoa!");
        }
    }

    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach s = timSachTheoMa(maSach);
        if (s != null) {
            s.setSoLuong(soLuongMoi);
            System.out.println("Cap nhat so luong thanh cong!");
        } else {
            System.out.println("Khong tim thay ma sach!");
        }
    }

    public Sach timSachTheoMa(String ma) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(ma)) {
                return s;
            }
        }
        return null;
    }

    public void hienThiTatCa() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        for (Sach s : danhSach) {
            s.hienThiThongTin();
        }
    }
}
