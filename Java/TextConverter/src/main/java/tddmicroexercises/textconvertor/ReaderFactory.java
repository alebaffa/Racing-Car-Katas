package tddmicroexercises.textconvertor;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by alebaffa on 09/10/16.
 */
public interface ReaderFactory {
    Reader createReader() throws IOException;

    String getItemName();
}
