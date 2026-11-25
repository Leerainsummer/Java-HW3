package EXTRA;
import java.io.*;
import java.nio.charset.StandardCharsets;
// java.io：以try-with-resources確保關閉檔案，明確使用UTF-8。
public class Example02_StudyLog {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("study-log.txt"),StandardCharsets.UTF_8))) {
            writer.write("CH4：繼承、抽象類別與介面"); writer.newLine();
            writer.write("CH5：例外處理、檔案與執行緒"); writer.newLine();
        }
        try(BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream("study-log.txt"),StandardCharsets.UTF_8))) {
            String line; int count=0;
            while((line=reader.readLine())!=null) System.out.println(++count+". "+line);
        }
    }
}
