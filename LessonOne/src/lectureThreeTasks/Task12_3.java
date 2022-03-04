package lectureThreeTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task12_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите сумму:");
        String salary = reader.readLine();
        System.out.println("Я буду зарабатывать $" + salary + " в час");
    }
}
