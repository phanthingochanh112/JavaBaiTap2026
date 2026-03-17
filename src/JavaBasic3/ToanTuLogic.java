package JavaBasic3;

import javax.swing.*;
public class ToanTuLogic {
    private static final int number = 100;
    public static void checkNumber ( int n) {
        if (n == number) {
            System.out.println( n+ "bang number:" + number);
        } else if (n < number) {
            System.out.println( n+ "nho hon number" + number);
        } else {
            System.out.println( n+ " lớn hơn number "  + number);
        }
    }
    public static void main(String[] args) {
        // Toán tử Hoặc
        int age = 34;
        String DOB = "10/10/1992";
        String address = " Tiền Giang";
        String name = " Bánh Hẹ";
        // Hàm kiểm tra điều kiện
        if (age < 40 || DOB.equals("10/10/1992")) {
            System.out.println("Được phép truy cập admin ");
        } else
            System.out.println(" Không ược phép truy cập quyền admin");
        System.out.println("------------------");
        // Hàm checkNumber
        int n = 109;
        checkNumber(n);
    }

}


