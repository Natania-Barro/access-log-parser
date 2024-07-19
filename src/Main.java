import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("“Введите текст и нажмите <Enter>: ");
        String text = new Scanner(System.in).nextLine();
        System.out.println("Длина текста: " + text.length());


        Scanner scanner = new Scanner(System.in);
        int validFileCount = 0;

        while (true) {
            System.out.println("Укажи путь к файлу:");
            String path = scanner.nextLine();  // Используем один экземпляр Scanner

            if (path.equalsIgnoreCase("exit")) {
                System.out.println("Выход");
                break;
            }

            File file = new File(path);
            boolean fileExists = file.exists();  // Проверяем, существует ли файл
            boolean isDirectory = file.isDirectory();  // Проверяем, является ли путь директорией

            if (!fileExists || isDirectory) {
                System.out.println("Это путь к папке или к несуществующему пути.");
                System.out.println("Ты ввел херню, напиши точный путь к файлу!");
                System.out.println("__________________________________________");
                continue;  // Продолжаем цикл
            } else {
                validFileCount++;
                System.out.println("Путь указан верно!");
                System.out.println("Этот файл № " + validFileCount);
            }
        }
    }
}

