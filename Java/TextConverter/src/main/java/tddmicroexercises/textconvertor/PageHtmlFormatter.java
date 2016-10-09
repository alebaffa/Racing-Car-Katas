package tddmicroexercises.textconvertor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by alebaffa on 09/10/16.
 */
public class PageHtmlFormatter extends Formatter {
    private BufferedReader bufferedReader;

    public PageHtmlFormatter(Reader reader) {
        this.bufferedReader = new BufferedReader(reader); }

    public void convertToHtml() throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if (line.contains("PAGE_BREAK")) {
                break;
            }
            convertLine(line);
            addBreakLine();
        }
        bufferedReader.close();
    }
}
