package EXTRA;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
// java.net：解析網址並編碼查詢字串；不用連線也能執行。
public class Example03_WebAddress {
    public static void main(String[] args) {
        String keyword="Java 例外處理";
        String query=URLEncoder.encode(keyword,StandardCharsets.UTF_8);
        URI address=URI.create("https://example.com/search?q="+query);
        System.out.println("通訊協定："+address.getScheme());
        System.out.println("主機："+address.getHost());
        System.out.println("路徑："+address.getPath());
        System.out.println("編碼後網址："+address.toASCIIString());
    }
}
