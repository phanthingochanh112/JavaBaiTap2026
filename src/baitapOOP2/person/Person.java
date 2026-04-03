package baitapOOP2.person;

public class Person {
    String name;
    String gender;
    private String address;
    private String phone;
    int age;

    // Constructor đầy đủ - khởi tạo tất cả thông tin
    public Person(String name, String gender, String address, String phone, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }

    // Constructor khi private  - nếu không có address/phone

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.address = "Chưa cập nhật";
        this.phone = "Chưa cập nhật";
        this.age = age;
    }

    public void personInformation() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }


    // Hàm getter để lấy địa chỉ của người dùng

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    // Hàm setter để cập nhật địa chỉ và phone (truyền giá trị cho biến private)

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void getAddressInfo() {
        System.out.println("Address: " + address);
    }

    public void getPhoneInfo() {
        System.out.println("Phone: " + phone);

    }

}





