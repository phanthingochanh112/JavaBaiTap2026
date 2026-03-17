package Variables;
 //// Khai báo biến local

// public class SinhVien {
//    public static void main ( String[] arr){
//        String  name = " Phan Thị Ngọc Hạnh";
//        int age = 35;
//        String address = " 543/81 Nguyễn Đình Chiểu, phường Bàn Cờ, Quận 3";
//        String job = " Công nghệ thông tin ";
//        String DOB = "10/10/1992";
//        System.out.println(" Tên nhân viên là: " + name );
//        System.out.println(" Tuổi nhân viên la:" + age);
//        System.out.println(" Địa chỉ nhân viên la:" + address);
//        System.out.println(" Nghe nghiep nhan vien:" + job );
//        System.out.println(" Day of Birthday:" + DOB);
//    }
//
//}
//
////   Khai báo biến Instance
//
//public class SinhVien {
//     String  name ;
//     int age ;
//     String address;
//     String job ;
//     String DOB ;
//     public void ShowInfo(){
//         System.out.println(" Tên nhân viên là: " + name );
//         System.out.println(" Tuổi nhân viên la:" + age);
//         System.out.println(" Địa chỉ nhân viên la:" + address);
//         System.out.println(" Nghe nghiep nhan vien:" + job );
//         System.out.println(" Day of Birthday:" + DOB);
//     }
//    public static void main(String[] args) {
//        SinhVien object = new SinhVien();
//        object.name = " Phan Thị Ngọc Hạnh";
//        object.age = 35;
//        object.address = " Thành phố Hồ Chí Minh";
//        object.job = "CNTT";
//        object.DOB = "10/10/1992";
//        object.ShowInfo();
//    }
//}


//// Khai báo biến static
public class SinhVien {
     public  static String name1 = " Phan Thị Ngọc Hạnh";
     public  static int age1 = 35;
     public static String address1 = " Thành Phố Hồ Chí Minh";
     public void GetInfo(){
         System.out.println(" Tên nhân viên là: " + name1 );
         System.out.println(" Tuổi nhân viên la:" + age1);
         System.out.println(" Địa chỉ nhân viên la:" + address1);
     }
    public static void main(String[] args) {
        ThongTin object1 = new ThongTin();
        System.out.println("Tên" +SinhVien.name1);
      }
}

