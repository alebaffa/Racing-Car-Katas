package tddmicroexercises.textconvertor;

import java.io.IOException;

/**
 * Created by alebaffa on 09/10/16.
 */
abstract class Formatter {
    private static final String BREAK_LINE = "<br />";
    private String html = "";

    abstract void convertToHtml() throws IOException;

    void addBreakLine() {
        html += BREAK_LINE;
    }

    void convertLine(String line) {
        html += StringEscapeUtils.escapeHtml(line);
    }

    public String getHtml() {
        return html;
    }
}
