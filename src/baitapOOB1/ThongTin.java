package baitapOOB1;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Phan Thị Ngọc Hạnh", "Nữ", "NV001", "123 Nguyen Đình Chiểu,Ho Chi Minh City", 34);
        NhanVien nv2 = new NhanVien("Tran Thi Cẩm Châu", "Nu", "NV002", "456 Le Loi, Ho Chi Minh City", 28);
        NhanVien nv3 = new NhanVien("Le Van Hậu", "Nam", "NV003", "789 Tran Hung Dao, Da Nang", 35);

        System.out.println("Thông tin nhân viên 1:");
        nv1.thongTinNhanVien();
        System.out.println("===================");

        System.out.println("Thông tin nhân viên 2:");
        nv2.thongTinNhanVien();
        System.out.println("===================");

        System.out.println("Thông tin nhân viên 3:");
        nv3.thongTinNhanVien();
    }
}
