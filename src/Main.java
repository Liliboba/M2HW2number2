import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // b) Считываем 5 строк и добавляем их в список А
        List<String> listA = new ArrayList<>();
        System.out.println("Введите 5 строк для списка A:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        // c) Отображаем список А
        System.out.println("Список A: " + listA);

        // d) Считываем еще 5 строк и добавляем их в список Б
        List<String> listB = new ArrayList<>();
        System.out.println("Введите 5 строк для списка B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        // Отображаем список Б
        System.out.println("Список B: " + listB);

        // e) Объединяем списки A и B в новый список C в требуемом порядке
        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));       // A1, A2, A3, A4, A5
            listC.add(listB.get(4 - i));   // B5, B4, B3, B2, B1
        }

        // f) Отображаем объединенный список C
        System.out.println("Список C после объединения: " + listC);

        // g) Сортируем список C по длине строк и отображаем отсортированный список
        listC.sort(Comparator.comparingInt(String::length));
        System.out.println("Список C после сортировки по длине: " + listC);
    }
}
