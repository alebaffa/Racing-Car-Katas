package tddmicroexercises.textconvertor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by alebaffa on 09/10/16.
 */
public class HtmlFormatter extends Formatter {
    private BufferedReader bufferedReader;

    public HtmlFormatter(Reader reader) {
        this.bufferedReader = new BufferedReader(reader);
    }

    @Override
    public void convertToHtml() throws IOException {
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            convertLine(line);
            addBreakLine();
        }
        bufferedReader.close();
    }
}
