import java.util.Scanner;

public class Tamgiac {
    // Các thuộc tính
    private double canhA;
    private double canhB;
    private double canhC;

    // Constructor
    public Tamgiac(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    // Phương thức kiểm tra 3 giá trị có phải là 3 cạnh của một tam giác hay không
    public boolean laTamGiac() {
        return (canhA + canhB > canhC) && (canhA + canhC > canhB) && (canhB + canhC > canhA);
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        return canhA + canhB + canhC;
    }

    // Phương thức tính diện tích theo công thức Heron
    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
    }

    public static void main(String[] args) {
        // Nhập vào 3 số từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài các cạnh của tam giác:");

        System.out.print("Canh A: ");
        double canhA = scanner.nextDouble();

        System.out.print("Canh B: ");
        double canhB = scanner.nextDouble();

        System.out.print("Canh C: ");
        double canhC = scanner.nextDouble();

        // Tạo đối tượng Tamgiac
        Tamgiac tamGiac = new Tamgiac(canhA, canhB, canhC);

        // Kiểm tra và in kết quả
        if (tamGiac.laTamGiac()) {
            System.out.println("Chu vi tam giác: " + tamGiac.tinhChuVi());
            System.out.println("Diện tích tam giác: " + tamGiac.tinhDienTich());
        } else {
            System.out.println("Ba giá trị không phải là độ dài của ba cạnh của một tam giác.");
        }
    }
}

