package ru.mirea.kabo0222.task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        System.out.println("Введите номер месяца (1-12):");
        int month = scanner.nextInt() - 1;

        System.out.println("Введите число:");
        int day = scanner.nextInt();


        System.out.println("Введите часы (0-23):");
        int hours = scanner.nextInt();

        System.out.println("Введите минуты:");
        int minutes = scanner.nextInt();


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String dateString = year + "-" + (month + 1) + "-" + day + " " + hours + ":" + minutes;
        Date date = null;
        try {
            date = dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Ошибка ввода даты и времени.");
            return;
        }

        System.out.println("Объект Date: " + date);


        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);

        System.out.println("Объект Calendar: " + calendar.getTime());
    }
}
