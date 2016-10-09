package tddmicroexercises.textconvertor;

import java.io.*;

public class HtmlTextConverter {
    private String fullFilenameWithPath;
    private ReaderFactory readerFactory;

    public HtmlTextConverter(String fullFilenameWithPath) {
        this.fullFilenameWithPath = fullFilenameWithPath;
        this.readerFactory = new FileReaderFactory(fullFilenameWithPath);
    }

    public HtmlTextConverter(ReaderFactory readerFactory) throws IOException {
        this.readerFactory = readerFactory;
    }

    public String convertToHtml() throws IOException {

        BufferedReader reader = new BufferedReader(readerFactory.createReader());

        String line = reader.readLine();
        String html = "";
        while (line != null) {
            html += StringEscapeUtils.escapeHtml(line);
            html += "<br />";
            line = reader.readLine();
        }
        return html;

    }

    public String getFilename() {
        return this.fullFilenameWithPath;
    }
}
