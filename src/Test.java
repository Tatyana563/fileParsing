import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("test.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fin));
        LineNumberReader lineNumberReader = new LineNumberReader(br);
        Pattern pattern = Pattern.compile("500");
        String line = lineNumberReader.readLine();
        while (line != null) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {


                System.out.println(line + "Page number: " + lineNumberReader.getLineNumber());
            }
            line = lineNumberReader.readLine();
        }
    }
}

