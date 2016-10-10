package tddmicroexercises.textconvertor;

import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HtmlTextConverterTest {
    @Test
    public void should_return_the_filename() {
        HtmlTextConverter converter = new HtmlTextConverter("foo");
        assertThat(converter.getFilename(), is("foo"));
    }

    @Test
    public void should_return_the_string_converted() throws IOException {
        HtmlTextConverter converter = new HtmlTextConverter("");

        Reader stringReader = new StringReader("foo");

        assertThat(converter.convertToHtml(stringReader), is("foo<br />"));
    }

}
