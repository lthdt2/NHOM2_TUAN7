import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSach = new ArrayList<>();

    public void themSach(Sach s) {
        danhSach.add(s);
    }

    public boolean xoaSach(String maSach) {
        return danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    public boolean capNhatGiaCoBan(String maSach, double giaMoi) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setGiaCoBan(giaMoi);
                return true;
            }
        }
        return false;
    }

    public Sach timSach(String maSach) {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    public void hienThi() {
        for (Sach s : danhSach) {
            System.out.println(s.toString());
        }
    }
}