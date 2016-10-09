package tddmicroexercises.textconvertor;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * Created by alebaffa on 09/10/16.
 */
public class StringReaderFactory implements ReaderFactory {
    String filename;

    public StringReaderFactory(String filename) {
        this.filename = filename;
    }

    @Override
    public Reader createReader() throws IOException {
        return new StringReader(filename);
    }
}
