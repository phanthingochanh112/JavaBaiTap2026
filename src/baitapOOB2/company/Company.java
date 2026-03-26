package baitapOOB2.company;

import baitapOOB2.person.Person;

public class Company {
    public static void main(String[] args) {
        Person person1 = new Person("Tran Bao Chau", "Nữ", "Ha Noi", "0123456789", 25);
        System.out.println("Thông tin nhân viên 1 ");
        person1.personInformation();
        person1.getAddressInfo();
        person1.getPhoneInfo();

        // Cách 2: Khởi tạo cơ bản, sau đó dùng setter để cập nhật bien private address/phone

        System.out.println("Thông tin nhân viên 2");
        // Cách 2: Khởi tạo cơ bản, sau đó dùng setter để cập nhật address/phone
        Person person2 = new Person("Nguyen Van An", "Nam", 30);
        person2.setAddress("Thanh Pho Can Tho");
        person2.setPhone("0987654321");
        person2.personInformation();
        person2.getAddressInfo();
        person2.getPhoneInfo();

    }
}
