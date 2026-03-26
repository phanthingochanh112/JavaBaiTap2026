package baitapOOB1;

public class NhanVien {
    String name;
    String gender;
    String employeeID;
    String address;
    int age;

    public NhanVien(String name, String gender, String employeeID, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.employeeID = employeeID;
        this.address = address;
        this.age = age;
    }

    public void thongTinNhanVien(){
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Giới tính: " + gender);
        System.out.println("Mã nhân viên: " + employeeID);
        System.out.println("Địa chỉ: " + address);
        System.out.println("Tuổi: " + age);

    }

}
