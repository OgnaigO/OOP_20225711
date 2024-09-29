import java.util.Scanner;

public class TinhToanHaiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap hai so tu nguoi dung
        System.out.print("Nhap so thu nhat: ");
        String strNum1 = scanner.nextLine();
        System.out.print("Nhap so thu hai: ");
        String strNum2 = scanner.nextLine();

        // Chuyen doi chuoi thanh so double
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // Tinh tong, hieu, tich
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Kiem tra va tinh thuong
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Thuong cua hai so la: " + quotient);
        } else {
            System.out.println("Khong the chia cho 0.");
        }

        // In ket qua
        System.out.println("Tong cua hai so la: " + sum);
        System.out.println("Hieu cua hai so la: " + difference);
        System.out.println("Tich cua hai so la: " + product);

        scanner.close();
    }
}
