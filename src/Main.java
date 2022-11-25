import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        //задача 1
        int yearInput = 1905;
        isYearLeap(yearInput);

        //задача 2
        int clientDeviceYear = 2019;
        int clientOS = 1;
        whatVersionProgramm(clientDeviceYear, clientOS);

        //задача 3
        int deliveryDistance = 70;
        System.out.println("количество дней доставки " + howManyDaysDelivery(deliveryDistance));



    }

    public static int howManyDaysDelivery(int deliveryDistance) {
        deliveryDistance = deliveryDistance;
        int dayDelivery = 1;
        if (deliveryDistance <= 20) {
            //System.out.println("Потребуется дней: " + dayDelivery);
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                dayDelivery = dayDelivery + 1;
                //System.out.println("Потребуется дней: " + dayDelivery);
            } else {
                dayDelivery = dayDelivery + 2;
                //System.out.println("Потребуется дней: " + dayDelivery);
            }
        }
        return dayDelivery;
    }
        public static void whatVersionProgramm ( int clientDeviceYear, int clientOS ){
            clientDeviceYear = clientDeviceYear;
            clientOS = clientOS;
            int currentYear = LocalDate.now().getYear();
            if (clientDeviceYear < currentYear) {
                switch (clientOS) {
                    case 0:
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                        break;
                    case 1:
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                        break;
                    default:
                        System.out.println("продолжаем на ПК");
                }
            } else {
                switch (clientOS) {
                    case 0:
                        System.out.println("iOS");
                        break;
                    case 1:
                        System.out.println("android");
                        break;
                    default:
                        System.out.println("продолжаем на ПК");
                }
            }
        }





    public static void isYearLeap( int god ) {
        god = god;
        if ((god % 4 == 0 && god % 100 != 0) || god % 400 == 0) {
            System.out.println(god + " год является високосным");
        } else {
            System.out.println(god + " год не является високосным");
        }

    }
}