import java.io.*;
public class FileOperator {
    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter
                    (new FileWriter("/Users/haming.u/Desktop/database.txt"));

            writer.write("ID: 1, 이름: 자냥이, 나이: 150세\n");
            writer.write("\nID: 2, 이름: 김코딩, 나이: 29세\n");
            writer.write("\nID: 3, 이름: 박해커, 나이: 41세\n");
            writer.write("\nID: 4, 이름: 나천재, 나이: 32세\n");
            writer.write("\nID: 5, 이름: 이코즈, 나이: 26세\n");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
