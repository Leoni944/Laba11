package ru.mirea.kabo0222.task2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {
        Date currentDate = new Date();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/MM/yyyy HH:mm:ss:");
        String userInput = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date userDate = null;
        try {
            userDate = dateFormat.parse(userInput);
        } catch (ParseException e) {
            System.out.println("Ошибка ввода даты.");
            return;
        }

        if (userDate.before(currentDate)) {
            System.out.println("Введенная дата раньше текущей даты.");
        } else if (userDate.after(currentDate)) {
            System.out.println("Введенная дата позже текущей даты.");
        } else {
            System.out.println("Введенная дата совпадает с текущей датой.");
        }
    }
}
