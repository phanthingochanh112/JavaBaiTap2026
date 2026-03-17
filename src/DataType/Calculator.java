package DataType;
public class Calculator {
    public static int SumSoNguyen(int a, int b) {
        return a + b;
    }
    public static  double TichSoNguyen( double a, double b){
        return a * b;
    }
// Nếu gọi Main trực tiếp đê chạy
    public static void main(String[] args) {
        int kq1 = SumSoNguyen(20,31);
        double kq2 = TichSoNguyen(143.1,134.2);
        System.out.println(kq1);
        System.out.println(kq2);
     }
}

