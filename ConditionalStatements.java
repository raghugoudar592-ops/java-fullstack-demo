public class ConditionalStatements {

    public static void main(String[] args) {

        System.out.println("--- 5a) Check if a number is positive ---");
        isNumberPositive(10);
        System.out.println("\n");

        System.out.println("--- 5b) Check if a number is positive, negative, or zero ---");
        isNumberPositiveNegativeOrZero(-5);
        isNumberPositiveNegativeOrZero(0);
        System.out.println("\n");
        
        System.out.println("--- 5c) Classify student percentage ---");
        classifyPercentage(75);
        classifyPercentage(92);
        classifyPercentage(35);
        System.out.println("\n");

        System.out.println("--- 5d) Convert digit to day of the week ---");
        convertDigitToDay(3);
        convertDigitToDay(7);
        System.out.println("\n");

        System.out.println("--- 5e) Find the greater number using the ternary operator ---");
        findGreaterNumber(5, 10);
    }

    // Example 5a: Is number positive?
    public static void isNumberPositive(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        }
    }

    // Example 5b: Is number positive, negative, or zero?
    public static void isNumberPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number " + number + " is zero.");
        }
    }

    // Example 5c: Classify student percentage
    public static void classifyPercentage(int percentage) {
        if (percentage >= 80) {
            System.out.println("A student with " + percentage + "% has achieved First Class.");
        } else if (percentage >= 60) {
            System.out.println("A student with " + percentage + "% has achieved Second Class.");
        } else if (percentage >= 40) {
            System.out.println("A student with " + percentage + "% has achieved Third Class.");
        } else {
            System.out.println("A student with " + percentage + "% has failed (Distraction).");
        }
    }

    // Example 5d: Convert digit to day
    public static void convertDigitToDay(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid Day";
                break;
        }
        System.out.println("Day " + dayNumber + " is " + dayName + ".");
    }

    // Example 5e: Greater or smaller number using the ternary operator
    public static void findGreaterNumber(int num1, int num2) {
        String result = (num1 > num2) ? "The greater number is " + num1 : "The greater number is " + num2;
        System.out.println(result);
    }
}