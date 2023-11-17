// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Tamgiac và tính chu vi, diện tích
        Tamgiac tamGiac = new Tamgiac(5, 4, 7);

        // Kiểm tra và in kết quả
        if (tamGiac.laTamGiac()) {
            System.out.println("Chu vi tam giác: " + tamGiac.tinhChuVi());
            System.out.println("Diện tích tam giác: " + tamGiac.tinhDienTich());
        } else {
            System.out.println("Ba giá trị không phải là độ dài của ba cạnh của một tam giác.");
        }
    }
}
