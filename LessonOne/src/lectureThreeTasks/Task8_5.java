package lectureThreeTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите Имя:");
        String name1 = reader.readLine();
        System.out.println("Введите Имя:");
        String name2 = reader.readLine();
        System.out.println("Введите Имя:");
        String name3 = reader.readLine();
        System.out.println(name1 + " + " +  name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}
