package tddmicroexercises.textconvertor;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * Created by alebaffa on 09/10/16.
 */
public class StringReaderFactory implements ReaderFactory {
    private String string;

    public StringReaderFactory(String string) {
        this.string = string;
    }

    @Override
    public Reader createReader() throws IOException {
        return new StringReader(string);
    }

    @Override
    public String getItemName() {
        return this.string;
    }
}
