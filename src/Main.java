import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // создаем объект File в качестве каталога

        String text = "Hello world!";
// откроем байтовый поток записи в файл
        try (FileOutputStream fos = new FileOutputStream("notes.txt")) {
// перевод строки в массив байтов
            byte[] bytes = text.getBytes();
// запись байтов в файл
            fos.write(bytes, 0, bytes.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        // откроем байтовый поток для чтения файла
        try (FileInputStream fin = new FileInputStream("notes.txt")) {
            int i;
// считываем файл пока есть доступные байты
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}