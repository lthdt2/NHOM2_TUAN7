import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n===== QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm Sách Giáo Trình");
            System.out.println("2. Thêm Sách Tiểu Thuyết");
            System.out.println("3. Hiển thị danh sách sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (chon) {
                case 1:
                    System.out.println("\n--- Nhập thông tin Sách Giáo Trình ---");
                    System.out.print("Tên sách: ");
                    String tenGT = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tacGiaGT = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int namGT = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double giaGT = sc.nextDouble();

                    danhSachSach.add(new SachGiaoTrinh(tenGT, tacGiaGT, namGT, giaGT));
                    System.out.println("✅ Đã thêm Sách Giáo Trình thành công!");
                    break;

                case 2:
                    System.out.println("\n--- Nhập thông tin Sách Tiểu Thuyết ---");
                    System.out.print("Tên sách: ");
                    String tenTT = sc.nextLine();
                    System.out.print("Tác giả: ");
                    String tacGiaTT = sc.nextLine();
                    System.out.print("Năm xuất bản: ");
                    int namTT = sc.nextInt();
                    System.out.print("Giá cơ bản: ");
                    double giaTT = sc.nextDouble();
                    System.out.print("Là sách series? (true/false): ");
                    boolean series = sc.nextBoolean();

                    danhSachSach.add(new SachTieuThuyet(tenTT, tacGiaTT, namTT, giaTT, series));
                    System.out.println("✅ Đã thêm Sách Tiểu Thuyết thành công!");
                    break;

                case 3:
                    System.out.println("\n=== DANH SÁCH SÁCH HIỆN CÓ ===");
                    if (danhSachSach.isEmpty()) {
                        System.out.println("⚠️ Chưa có sách nào trong danh sách!");
                    } else {
                        for (Sach s : danhSachSach) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 0:
                    System.out.println("👋 Thoát chương trình!");
                    break;

                default:
                    System.out.println("⚠️ Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    break;
            }

        } while (chon != 0);

        sc.close();
    }
}
