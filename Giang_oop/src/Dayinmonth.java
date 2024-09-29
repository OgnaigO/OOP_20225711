import java.util.Scanner;

public class Dayinmonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String monthInput = "";
        int year = -1;
        int days = 0;
        boolean validInput = false;

        // Nhap thang va kiem tra hop le
        while (!validInput) {
            System.out.print("Nhap thang: ");
            monthInput = scanner.nextLine().trim();

            // Nhap nam va kiem tra hop le
            while (year < 0) {
                System.out.print("Nhap nam: ");
                if (scanner.hasNextInt()) {
                    year = scanner.nextInt();
                    if (year < 0) {
                        System.out.println("Nhap khong hop le. Vui long nhap lai.");
                    }
                } else {
                    System.out.println("Nhap khong hop le. Vui long nhap lai.");
                    scanner.next(); // Loai bo nhap sai
                }
            }

            int month = convertMonthToNumber(monthInput);

            if (month == -1) {
                System.out.println("Thang khong hop le. Vui long nhap lai.");
            } else {
                // Kiem tra so ngay trong thang
                days = getDaysInMonth(month, year);
                validInput = true;
            }
        }

        System.out.println("So ngay cua thang " + monthInput + " nam " + year + " la: " + days);
        scanner.close();
    }

    // Ham chuyen thang thanh so (1-12)
    public static int convertMonthToNumber(String month) {
        month = month.toLowerCase();

        switch (month) {
            case "january":
            case "jan":
            case "jan.":
            case "1":
                return 1;
            case "february":
            case "feb":
            case "feb.":
            case "2":
                return 2;
            case "march":
            case "mar":
            case "mar.":
            case "3":
                return 3;
            case "april":
            case "apr":
            case "apr.":
            case "4":
                return 4;
            case "may":
            case "5":
                return 5;
            case "june":
            case "jun":
            case "jun.":
            case "6":
                return 6;
            case "july":
            case "jul":
            case "jul.":
            case "7":
                return 7;
            case "august":
            case "aug":
            case "aug.":
            case "8":
                return 8;
            case "september":
            case "sep":
            case "sep.":
            case "9":
                return 9;
            case "october":
            case "oct":
            case "oct.":
            case "10":
                return 10;
            case "november":
            case "nov":
            case "nov.":
            case "11":
                return 11;
            case "december":
            case "dec":
            case "dec.":
            case "12":
                return 12;
            default:
                return -1; // Nhap sai thang
        }
    }

    // Ham tra ve so ngay trong thang
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; // Khong hop le
        }
    }

    // Ham kiem tra nam nhuan
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false; 
            }
            return true;
        }
        return false;
    }
}