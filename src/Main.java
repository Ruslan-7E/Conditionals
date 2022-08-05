public class Main {
    public static void main(String[] args) {
        // task 1
        int clientOS = 1;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // task 2
        int clientDeviceYear = 2017;

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // task 3
        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // task 4
        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance > 20) {
            deliveryDays++;
        }

        if (deliveryDistance > 60) {
            deliveryDays++;
        }

        System.out.println("Потребуется дней: " + deliveryDays);

        // task 5
        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Incorrect month " + monthNumber);
        }


//        int age = 19;
//        boolean isSkyClear = true;
//        boolean canNotGoToSchool = age < 7 || age > 18;
//
//        if (age >= 18 && age <= 21) {
//            System.out.println("Ты можешь водить, но не можешь бухать.");
//        }
//
//        if (canNotGoToSchool) {
//            System.out.println("You probably don't go to school.");
//        }
//
//        if (isSkyClear) {
//            System.out.println("The sky is clear.");
//        }
    }
}

