package JavaBasic5;

import java.util.ArrayList;

public class InfoEmployee {
    // Array list lưu thông tin nhân vien
    static ArrayList<String> infolist = new ArrayList<>();

    // Hàm thêm nhiều nhân vien
    public static void AddInfoEmployee (String id, String name,int age, String phongban){
        String thongtinNV ="id:" + id +", name:" + name +", age:" + age +", phongban:" + phongban;
        infolist.add(thongtinNV);

    }
    public static void main(String[] args) {
        //Gọi hàm thêm nhân viên
        AddInfoEmployee("01","Phan Thị Ngọc Hạnh",34,"QA" );
        AddInfoEmployee("02","Trần Thị Cẩm Châu",28,"QA");
        // Duyệt list băng for
        for (int i = 0; i<infolist.size(); i++){
            System.out.println(infolist.get(i));
        }
    }
}
