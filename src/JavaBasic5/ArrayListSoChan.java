package JavaBasic5;
import java.util.ArrayList;

public class ArrayListSoChan {
    public static void main(String[] args) {
         int max = 50;
        // Xuất mảng số chẳn từ 0--> 50 bài tập JavaBasic4
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<= max; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
         // Ctrl + Alt + L chinh format code
        System.out.println(list);
        // Vòng lap duyet qua từng phần tử mảng
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
