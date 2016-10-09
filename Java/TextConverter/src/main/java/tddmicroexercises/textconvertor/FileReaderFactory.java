package tddmicroexercises.textconvertor;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
 * Created by alebaffa on 09/10/16.
 */
public class FileReaderFactory implements ReaderFactory {
    private String filename;

    public FileReaderFactory(String fullFilenameWithPath) {
        this.filename = fullFilenameWithPath;
    }

    @Override
    public Reader createReader() throws FileNotFoundException {
        return new FileReader(filename);
    }

    @Override
    public String getItemName() {
        return this.filename;
    }
}
