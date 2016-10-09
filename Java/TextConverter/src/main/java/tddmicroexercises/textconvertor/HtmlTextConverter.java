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
        HtmlFormatter htmlFormatter = getHtmlFormatter();
        return htmlFormatter.convertToHtml();
    }

    private HtmlFormatter getHtmlFormatter() throws IOException {
        return new HtmlFormatter(readerFactory.createReader());
    }

    public String getFilename() {
        return this.fullFilenameWithPath;
    }
}
