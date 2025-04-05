package javabasics.lesson2;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DataTypes {
    @Test
    public void printPersonalData() {
        String firstName = "Vladimir";
        String lastName = "Trofimov";
        Short age = 21;
        LocalDate birthDate = LocalDate.of(2025, 2, 1);
        LocalDate currentDate = LocalDate.now();
        long daysFromBirthdate = ChronoUnit.DAYS.between(birthDate, currentDate.plusDays(1));
        String emailAddress = "vtrofimov@test.org";
        String sex = "Male";
        boolean haveCar = true;
        Long personalCode = 31120412345L;
        String streetAddress = "Akas 10, Riga, LV-1001";
        double heightInMeters = 1.99;
        int weigthInKilograms = 99;

        System.out.println("Hi! my name is " + firstName + " " + lastName + " and I'm " + age + ". My Birthday is " + birthDate);
        System.out.println(daysFromBirthdate);
    }

    @Test
    public void task1() {
        int brotherAge = 15;
        int sisterAge = 10;

        System.out.println("Together we are " + (sisterAge + brotherAge) + " years old!");
    }

    @Test
    public void task2() {
        int brotherAge = 15;
        int sisterAge = 10;

        System.out.println("Together we are " + sisterAge + brotherAge + " years old!");
    }

    @Test
    public void task3() {
        int firstDistance = 150;
        int secondDistance = 1520;

        firstDistance = 151;

        System.out.println("Total distance is:" + (firstDistance + secondDistance));
    }

    @Test
    public void task4() {
        Integer workingDays = 17;
        Integer totalDays = null;

        System.out.println("We have worked " + workingDays + " of " + totalDays);
    }

    @Test
    public void task5() {
        String price = "15.30";
        String currency = "EUR";
        BigDecimal totalPrice = new BigDecimal(price);

        System.out.println("Total price is:" + price + currency);
//        System.out.println("Total price is: " + totalPrice + " " + currency);
        System.out.println("Total price is: " + totalPrice + currency);
        System.out.println("Total price is:" + price + " " + currency);
    }

    @Test
    public void task6() {
        String prefix = "Is that your e-mail address?";
        String address = "test@test.lv";
        String postfix = "received";
        String end = "days ago";
        String days = "33";

        System.out.println(prefix + address + postfix + Integer.parseInt(days) + end);
    }

    @Test
    public void task7() {
        String prefix = "You passed";
        String distance = "7.5";
        String postfix = "km";

        System.out.println(prefix + " " + Integer.parseInt(distance) + " " + postfix);
    }

    @Test
    public void task8() {
        LocalDateTime dateTime = LocalDateTime.parse("2019-12-15T15:14:21.629");
        dateTime = dateTime.plusYears(3).plusDays(13).plusMinutes(15);

        System.out.println(dateTime.getDayOfMonth() + dateTime.getMonth().getDisplayName(TextStyle.FULL, Locale.FRANCE) + dateTime.getYear());
    }

    @Test
    public void task9() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println(LocalDateTime.parse("2019-12-15T15:14:21.629", formatter));
    }

    @Test
    public void task10() {
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime);
    }

    @Test
    public void task11() {
        String firstCar = "Audi";
        String secondCar = "BMW";

        boolean amIAudiFan = true;

        if (amIAudiFan) {
            System.out.println("My car is " + firstCar);
        } else {
            System.out.println("My car is " + secondCar);
        }
    }
}
