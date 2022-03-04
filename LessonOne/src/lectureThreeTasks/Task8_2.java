package lectureThreeTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Имя:");
        String name = reader.readLine();
        System.out.println("Введите число: ");
        String number1 = reader.readLine();
        System.out.println("Введите число: ");
        String number2 = reader.readLine();

        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");
    }
}
