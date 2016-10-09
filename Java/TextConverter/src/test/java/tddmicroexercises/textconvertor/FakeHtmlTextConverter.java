package tddmicroexercises.textconvertor;

import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;

/**
 * Created by alebaffa on 09/10/16.
 */
public class FakeHtmlTextConverter extends HtmlTextConverter {
    private String fullFilenameWithPath;

    public FakeHtmlTextConverter(String fullFilenameWithPath) {
        super(fullFilenameWithPath);
        this.fullFilenameWithPath = fullFilenameWithPath;
    }

    @Override
    protected Reader getReader() throws FileNotFoundException {
        return new StringReader(fullFilenameWithPath);
    }
}
