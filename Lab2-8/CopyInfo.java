import java.io.*;
import java.util.StringTokenizer;

public class CopyInfo {

    void readWrite() {
        try {
            // Читання тексту
            FileReader fr = new FileReader("C:\\Users\\Danylo\\Desktop\\jscodes\\Lab2-8\\text.txt"); // Читання з файлу
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            StringBuilder words = new StringBuilder();
            try {
                StringTokenizer st = new StringTokenizer(s);
                while (st.hasMoreTokens()) {
                    words.append(st.nextToken()).append(" ");
                }
            } finally {
                br.close();
            }
            FileWriter fw = new FileWriter("C:\\Users\\Danylo\\Desktop\\jscodes\\Lab2-8\\text1.txt"); // Запис тексту в інший файл
            PrintWriter pw = new PrintWriter(fw);
            pw.println(words.toString().trim());
            pw.close();
            System.out.println("Текст скопiйовано успiшно!");

            // Копіювання зображення
            try (FileInputStream in = new FileInputStream("C:\\Users\\Danylo\\Desktop\\jscodes\\Lab2-8\\image.jpeg"); // потік копіювання з файлу
                 FileOutputStream out = new FileOutputStream("C:\\Users\\Danylo\\Desktop\\jscodes\\Lab2-8\\image_copy.jpeg")) { // створення копії

                byte[] buffer = new byte[1024];
                int length;
                while ((length = in.read(buffer)) > 0) {
                    out.write(buffer, 0, length);
                }
                System.out.println("Зображення скопiйовано успiшно!");
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CopyInfo().readWrite();
    }
}
