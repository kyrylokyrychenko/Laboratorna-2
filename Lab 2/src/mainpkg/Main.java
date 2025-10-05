package mainpkg;

import Model.Abiturient;
import java.util.*;

/**
 Основний клас програми.
 Створює масив об'єктів типу Abiturient та виконує вибірки за критеріями.
 */
public class Main {

    /**
     Метод створює масив абітурієнтів для прикладу.

     @return масив об'єктів Abiturient
     */
    public static Abiturient[] createAbiturients() {
        return new Abiturient[]{
                new Abiturient(1, "Іваненко", "Олег", "Петрович", "Київ", "123456789", 8.5),
                new Abiturient(2, "Петренко", "Іван", "Іванович", "Львів", "987654321", 9.3),
                new Abiturient(3, "Сидоренко", "Олег", "Миколайович", "Харків", "555111222", 7.4),
                new Abiturient(4, "Коваль", "Марія", "Іванівна", "Одеса", "777888999", 9.7),
                new Abiturient(5, "Мельник", "Іван", "Сергійович", "Дніпро", "111222333", 6.9)
        };
    }

    /**
     Вивести список абітурієнтів із заданим ім'ям.

     @param abiturients масив абітурієнтів
     @param name ім'я для пошуку
     */
    public static void printByName(Abiturient[] abiturients, String name) {
        System.out.println("Абітурієнти з іменем \"" + name + "\":");
        for (Abiturient a : abiturients) {
            if (a.getFirstName().equalsIgnoreCase(name)) {
                System.out.println(a);
            }
        }
    }

    /**
     Вивести список абітурієнтів із середнім балом вище заданого.

     @param abiturients масив абітурієнтів
     @param minScore мінімальний середній бал
     */
    public static void printByMinScore(Abiturient[] abiturients, double minScore) {
        System.out.println("Абітурієнти з середнім балом вище " + minScore + ":");
        for (Abiturient a : abiturients) {
            if (a.getAverageScore() > minScore) {
                System.out.println(a);
            }
        }
    }

    /**
     Вивести n абітурієнтів із найвищим середнім балом.

     @param abiturients масив абітурієнтів
     @param n кількість абітурієнтів
     */
    public static void printTopN(Abiturient[] abiturients, int n) {
        System.out.println("Топ " + n + " абітурієнтів за середнім балом:");
        Arrays.stream(abiturients)
                .sorted((a, b) -> Double.compare(b.getAverageScore(), a.getAverageScore()))
                .limit(n)
                .forEach(System.out::println);
    }

    /**
     Головний метод програми.
     */
    public static void main(String[] args) {
        Abiturient[] abiturients = createAbiturients();

        printByName(abiturients, "Іван");
        System.out.println();

        printByMinScore(abiturients, 8.0);
        System.out.println();

        printTopN(abiturients, 3);
    }
}
