package tddmicroexercises.textconvertor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by alebaffa on 09/10/16.
 */
public class HtmlFormatter {
    private BufferedReader bufferedReader;
    private String html = "";

    public HtmlFormatter(Reader reader) {
        this.bufferedReader = new BufferedReader(reader);
    }

    public void convertToHtml() throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            convertLine(line);
            addLineBreak();
        }
    }

    private void addLineBreak() {
        html += "<br />";
    }

    private void convertLine(String line) {
        html += StringEscapeUtils.escapeHtml(line);
    }

    public String getHtml() {
        return html;
    }
}
