import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        // 01から09までのファイルパスを生成して配列に格納
        String[] filePaths = new String[8];
        for (int i = 0; i < 8; i++) {
            int index = 1 + i;
            filePaths[i] = String.format("src/test%02d/cytech%02d", index, index);
        }

        // 各ファイルパスについてファイルを作成
        for (String filePath : filePaths) {
            createFile(filePath);
        }
    }

    private static void createFile(String filePath) throws IOException {
        Path path = Paths.get(filePath);

        // 親ディレクトリが存在しない場合は作成
        if (Files.notExists(path.getParent())) {
            Files.createDirectories(path.getParent());
        }

        // ファイルが存在しない場合は作成
        if (Files.notExists(path)) {
            Files.createFile(path);
            System.out.println("Created file: " + path.toString());
        } else {
            System.out.println("File already exists: " + path.toString());
        }
    }
}