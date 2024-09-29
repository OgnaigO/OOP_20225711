import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yeu cau nguoi dung nhap kich thuoc mang
        System.out.print("Nhap kich thuoc mang: ");
        int size = scanner.nextInt();

        // Khoi tao mang
        double[] array = new double[size];

        // Nhap cac phan tu cua mang
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // Sap xep mang
        Arrays.sort(array);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(array));
        // Tinh tong cac phan tu
        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        // Tinh gia tri trung binh
        double average = sum / size;

        // Hien thi ket qua
        System.out.println("Tong cac phan tu cua mang: " + sum);
        System.out.println("Gia tri trung binh cua cac phan tu: " + average);

        scanner.close();
    }
}
