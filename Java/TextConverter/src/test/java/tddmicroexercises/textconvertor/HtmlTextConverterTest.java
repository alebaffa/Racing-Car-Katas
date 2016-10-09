package tddmicroexercises.textconvertor;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HtmlTextConverterTest {
    @Test
    public void should_return_the_filename() {
        HtmlTextConverter converter = new HtmlTextConverter("foo");
        assertThat(converter.getFilename(), is("foo"));
    }

    @Test
    public void should_convert_text_to_html() throws IOException {
        String oneLine = "Hello";
        ReaderFactory readerFactory = new StringReaderFactory(oneLine);
        HtmlTextConverter converter = new HtmlTextConverter(readerFactory);
        assertThat(converter.convertToHtml(), is("Hello<br />"));
    }
}
