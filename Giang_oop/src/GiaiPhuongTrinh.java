import java.util.Scanner;

public class GiaiPhuongTrinh {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu lua chon
        System.out.println("Chon loai phuong trinh muon giai:");
        System.out.println("1. Phuong trinh bac nhat (ax + b = 0)");
        System.out.println("2. He phuong trinh bac nhat hai an");
        System.out.println("3. Phuong trinh bac hai (ax^2 + bx + c = 0)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                giaiPhuongTrinhBacNhat(scanner);
                break;
            case 2:
                giaiHePhuongTrinh(scanner);
                break;
            case 3:
                giaiPhuongTrinhBacHai(scanner);
                break;
            default:
                System.out.println("Lua chon khong hop le.");
        }

        scanner.close();
    }

    // Giai phuong trinh bac nhat ax + b = 0
    public static void giaiPhuongTrinhBacNhat(Scanner scanner) {
        System.out.println("Giai phuong trinh bac nhat ax + b = 0");
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la: x = " + x);
        }
    }

    // Giai he phuong trinh bac nhat hai an
    public static void giaiHePhuongTrinh(Scanner scanner) {
        System.out.println("Giai he phuong trinh bac nhat hai an:");
        System.out.println("a11 * x1 + a12 * x2 = b1");
        System.out.println("a21 * x1 + a22 * x2 = b2");

        // Nhap cac he so cua he phuong trinh
        System.out.print("Nhap a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Nhap a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Nhap b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Nhap a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Nhap a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Nhap b2: ");
        double b2 = scanner.nextDouble();

        // Tinh cac dinh thuc
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("He phuong trinh co vo so nghiem.");
            } else {
                System.out.println("He phuong trinh vo nghiem.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("Nghiem cua he phuong trinh la: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    // Giai phuong trinh bac hai ax^2 + bx + c = 0
    public static void giaiPhuongTrinhBacHai(Scanner scanner) {
        System.out.println("Giai phuong trinh bac hai ax^2 + bx + c = 0");
        System.out.print("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Day khong phai la phuong trinh bac hai. Chuyen ve giai phuong trinh bac nhat.");
            giaiPhuongTrinhBacNhat(scanner);
            return;
        }

        // Tinh delta
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem: x1 = " + x1 + ", x2 = " + x2);
        }
    }
}
