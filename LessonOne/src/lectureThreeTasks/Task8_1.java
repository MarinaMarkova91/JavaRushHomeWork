package lectureThreeTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Имя:");
        String name = reader.readLine();
        System.out.println("Введите число:");
        String years = reader.readLine();

        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");


    }
}
