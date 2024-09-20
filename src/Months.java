// Module 3 Excercise 3.11 
// By: Addison Roy

// Imports 
import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        System.out.print("Simple month to days java program!\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month in number format Ex: 1-12: ");
        int month = scanner.nextInt();
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        int days = DaysMonth(month, year);
        String monthName = monthName(month);

        System.out.println(monthName + " of " + year + " had " + days + " days");
    }

// Days in a month
    public static int DaysMonth(int month, int year) {
        switch (month) {
            case 1: // Jan
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August 
            case 10: // Oct
            case 12: // December
                return 31;
            case 4: // April
            case 6: // June
            case 9: // Sep
            case 11:  // Nov
                return 30;
            case 2: // Feb
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                throw new IllegalArgumentException("Invalid input Month: " + month);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 !=0) || (year % 400 ==0);
    }

    public static String monthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
            };
            return months[month -1];
        }

    }

