package JavaBasic3;

public class ToanTuQuanHe {
    // Hàm tính tổng
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 31;
        System.out.println(" Tong Se La :" + (a + b + c));
        System.out.println("------------------------");
        // Hàm tìm sô Max
        if ((a < b) && (b < c))
        System.out.println(" So Max là: "+c);
        // Ham tim số chẳn
        System.out.println("--------------------");
        String sochan;
        String sole;
        if ( a%2 == 0) {
            System.out.println("Số chẳn:" + a);
        } else {
            System.out.println("Số lẻ :" +a);
            }
            if (b%2==0){
                System.out.println("Số chẳn:" +b);
            }else {
                System.out.println(" Số lẻ:" + b);
            }
            if (c%2==0){
                System.out.println("Số chẳn:" +c);
            } else {
                System.out.println("Số le:" + c);
            }
        }
    }

