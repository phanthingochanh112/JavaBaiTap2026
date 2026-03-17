package JavaBasic4;

public class ForSoChanMang {
    public static void main(String[] args) {
         int count = 0;
        // In ra so chan tu 0 đên 50
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(" List so chẳn: " +i);
                count ++; // Dùng để đếm số phần tử là số chẳn
            }
        }
        // Tạo mảng đê lưu số chẳn vào đó
        int[] sochan = new int[count];
        int index = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                sochan[index] = i; // lưu số chẳn vào mảng
                index++;
            }
        }
        System.out.println(" Mảng số chẳn là : ");
        // Duyệt mảng và in ra kết quả sao khi gán số chẳn vào mảng
        for (int i = 0; i < sochan.length; i++) {
            System.out.println(sochan[i]);
        }
    }
}





