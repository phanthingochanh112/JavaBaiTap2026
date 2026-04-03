package baitapOOP2.person;

public class Information {
    public static void main(String[] args) {
        Person person1 = new Person("Nguyen Van Dau", "Nam", "123 Nguyen Trai, Hanoi", "0123456789", 30);
        Person person2 = new Person("Tran Thi Bay", "Nu", "456 Le Loi, Ho Chi Minh City", "0987654321", 25);
        person1.personInformation();
        System.out.println("===================");
        person2.personInformation();
        System.out.println("Thông tin địa chỉ sau khi cập nhật: ");

    }
}
