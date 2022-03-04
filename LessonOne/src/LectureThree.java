import javax.swing.text.DateFormatter;
import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.zip.DataFormatException;

public class LectureThree {
    public static void main(String[] args) {
        System.out.println("Поцелуй мой блестящий метеллический зад!");
        System.out.println();
        //Дата рождения
        String month = "DEC";
        int day = 3;
        int year = 1991;
        System.out.println(month + " " + day + " " + year);
        System.out.println();

        //StarCraft
        String name1 = "Zerg";
        String name2 = "protos";
        String name3 = "terran";
        int z = 10;
        int p = 5;
        int t = 12;

        //произведение 10 чисел
        int i = 1, c = 1;
        while (c <= 10) {
            i = i * c;
            c++;
        }
        System.out.println(i);
        System.out.println();

        //Сумма 10 чисел
        for (int a = 1, b = 1; b <= 10; a = a + b, b++) {
            System.out.println(a);
        }
        System.out.println();

        // Мама мыла раму

        String mama = "Мама";
        String soap = "Мыла";
        String frame = "Раму";
        System.out.println(mama + soap + frame + "\n" + mama + frame + soap + "\n"
                + soap + mama + frame + "\n" + soap + frame + mama + "\n" +
                frame + soap + mama + "\n" + frame + mama + soap);
        System.out.println();

        //Таблица умножения

        for (int i1 = 1; i1 < 10; i1++) {
            for (int k1 = 1; k1 < 10; k1++) {
                System.out.print(k1 * i1 + " ");
            }
            System.out.println(" ");
        }
        System.out.println();

        //Изучаем Японский
        System.out.println("日本語");

    }

}

