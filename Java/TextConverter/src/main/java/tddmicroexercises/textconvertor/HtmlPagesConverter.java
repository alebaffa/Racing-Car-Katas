package tddmicroexercises.textconvertor;

import java.io.IOException;

public class HtmlPagesConverter {

    private String filename;
    private ReaderFactory readerFactory;

    public HtmlPagesConverter(ReaderFactory readerFactory) throws IOException {
        this.readerFactory = readerFactory;
        this.filename = readerFactory.getItemName();
    }

    public HtmlPagesConverter(String filename) throws IOException {
        this(new FileReaderFactory(filename));
    }

    public String getHtmlPage(int page) throws IOException {
        Formatter htmlFormatter = getPageHtmlFormatter();
        htmlFormatter.convertToHtml();
        return htmlFormatter.getHtml();
    }

    private Formatter getPageHtmlFormatter() throws IOException {
        return new PageHtmlFormatter(readerFactory.createReader());
    }

    public String getFilename() { return readerFactory.getItemName(); }

}
