package tddmicroexercises.textconvertor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HtmlPagesConverter {

    private String filename;
    private ReaderFactory readerFactory;

    public HtmlPagesConverter(ReaderFactory readerFactory) throws IOException{
        this.readerFactory = readerFactory;
        this.filename = readerFactory.getFilename();
    }
    
    public HtmlPagesConverter(String filename) throws IOException {
        this(new FileReaderFactory(filename));
    }

    public String getHtmlPage(int page) throws IOException {
        PageHtmlFormatter htmlFormatter = getPageHtmlFormatter();
        htmlFormatter.convertToHtml();
        return htmlFormatter.getHtml();
    }

    private PageHtmlFormatter getPageHtmlFormatter() throws IOException {
        return new PageHtmlFormatter(readerFactory.createReader());
    }

    public String getFilename() {
        return this.filename;
    }
    
}
