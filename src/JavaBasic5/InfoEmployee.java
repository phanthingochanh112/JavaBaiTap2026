package JavaBasic5;

import java.util.ArrayList;

public class InfoEmployee {
    public static void main(String[] args) {
        ArrayList<String> infolist = new ArrayList<>();
        AddInfoEmployee(infolist);
        System.out.println(" Thông tin nhân viên: " +infolist);
        for (int i = 0; i<infolist.size(); i++){
            System.out.println(" Nhân viên sau khi duyệt thông tin : " +infolist.get(i));
        }
    }
    public static void AddInfoEmployee (ArrayList<String> infolist){;
        ArrayList employee = new ArrayList<>();
        infolist.add("Phan Thị Ngọc Hạnh");
        infolist.add("10/10/1992");
        infolist.add("Thành Phố Hồ Chí Minh");
        infolist.add("Công nghệ thông tin");
        infolist.add("Tester");
        infolist.add("0901371474");
        infolist.add("phanthingochanh112@gmail.com");

        // In ra thông tin với vòng lặp for basic

    }
}
