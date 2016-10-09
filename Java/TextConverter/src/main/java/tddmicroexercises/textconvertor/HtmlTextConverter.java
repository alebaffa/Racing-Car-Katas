package tddmicroexercises.textconvertor;

import java.io.*;

public class HtmlTextConverter {
    private String fullFilenameWithPath;

    public HtmlTextConverter(String fullFilenameWithPath) {
        this.fullFilenameWithPath = fullFilenameWithPath;
    }

    public String convertToHtml() throws IOException {
        HtmlFormatter formatter = getHtmlFormatter(getReader());
        formatter.convertToHtml();
        return formatter.getHtml();

    }

    private HtmlFormatter getHtmlFormatter(Reader reader) {
        return new HtmlFormatter(reader);
    }

    protected Reader getReader() throws FileNotFoundException {
        return new FileReader(fullFilenameWithPath);
    }

    public String getFilename() {
        return this.fullFilenameWithPath;
    }
}
