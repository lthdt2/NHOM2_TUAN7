public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "Giải tích 1", "Nguyễn Văn A", 2020, 5, 50000, "Toán", "Đại học");
        SachGiaoTrinh sg2 = new SachGiaoTrinh("GT02", "Hóa học cơ bản", "Trần Thị B", 2022, 3, 60000, "Hóa", "Phổ thông");
        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Doraemon", "Fujiko F. Fujio", 1995, 10, 40000, "Thiếu nhi", true);
        SachTieuThuyet st2 = new SachTieuThuyet("TT02", "Nhà giả kim", "Paulo Coelho", 2005, 4, 45000, "Triết lý", false);

        ql.themSach(sg1);
        ql.themSach(sg2);
        ql.themSach(st1);
        ql.themSach(st2);

        System.out.println("=== DANH SÁCH SÁCH ===");
        ql.hienThi();

        System.out.println("\n=== TÌM SÁCH 'TT01' ===");
        Sach s = ql.timSach("TT01");
        System.out.println(s != null ? s : "Không tìm thấy!");

        System.out.println("\n=== CẬP NHẬT GIÁ CƠ BẢN 'GT01' ===");
        ql.capNhatGiaCoBan("GT01", 70000);
        ql.hienThi();

        System.out.println("\n=== XÓA SÁCH 'GT02' ===");
        ql.xoaSach("GT02");
        ql.hienThi();
    }
}