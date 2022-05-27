import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void printSeparator() {
        System.out.println("+++++++");
        System.out.println("-------");
    }
    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }
    public static void leapCheck(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("This year is leap");
        } else {
            System.out.println("This is not leap year");
        }
    }
    public static void downloadSoft(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Download program on IOS by link:....");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Download program on Android by link:...");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Download simplified program on IOS by link:...");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Download simplified program on Android by link:...");
        }
    }
    public static void daysOfDelivery(int deliveryDistance) {
        int daysOfDelivery = 0;
        if (deliveryDistance <= 20) {
            int delivery20 = daysOfDelivery + 1;
            System.out.println("Days of delivery: " + delivery20);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            int delivery20_60 = daysOfDelivery + 2;
            System.out.println("Days of delivery: " + delivery20_60);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            int delivery60_100 = daysOfDelivery + 3;
            System.out.println("Days of delivery: " + delivery60_100);
        }
    }
    public static void main(String[] args) {
        ///Classwork
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);

        ///Homework

        ///Task 1
        leapCheck(2022);

        ///Task 2
        downloadSoft(0, 2016);

        ///Task 3
        daysOfDelivery(50);
    }
}