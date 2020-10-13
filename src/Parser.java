import java.io.*;

public class Parser {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("test.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fin));
        LineNumberReader lineNumberReader = new LineNumberReader(br);

        String line = lineNumberReader.readLine();
        while (line != null) {
            if (line.contains("500")) {
                System.out.println(line + "Page number: " + lineNumberReader.getLineNumber());
                line = lineNumberReader.readLine();
            }
        }
    }
}
