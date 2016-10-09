package tddmicroexercises.textconvertor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by alebaffa on 09/10/16.
 */
public class HtmlFormatter {
    private static final String BREAK_LINE = "<br />";
    BufferedReader bufferedReader;
    String html = "";

    public HtmlFormatter(Reader reader) {
        this.bufferedReader = new BufferedReader(reader);
    }

    public String convertToHtml() throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            convertLine(line);
            addBreakLine();
        }
        return html;
    }

    private void addBreakLine() {
        html += BREAK_LINE;
    }

    private void convertLine(String line) {
        html += StringEscapeUtils.escapeHtml(line);
    }
}
