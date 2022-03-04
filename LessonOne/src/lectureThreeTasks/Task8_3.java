package lectureThreeTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Имя:");
        String name = reader.readLine();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
