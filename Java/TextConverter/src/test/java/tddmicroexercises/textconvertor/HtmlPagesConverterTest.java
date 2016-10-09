package tddmicroexercises.textconvertor;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;


public class HtmlPagesConverterTest {
    @Test
    public void should_return_the_filename() throws IOException {
        String oneLine = "Hello";
        HtmlPagesConverter converter = getHtmlPagesConverter(oneLine);
        assertEquals("Hello", converter.getFilename());
    }

    @Test
    public void should_return_the_text_in_first_page() throws IOException {
        String oneLine = "Hello";
        HtmlPagesConverter converter = getHtmlPagesConverter(oneLine);
        assertThat(converter.getHtmlPage(0), is("Hello<br />"));
    }

    @Test
    public void should_return_the_text_of_two_pages() throws IOException {
        String oneLine = "Hello\nCiao";
        HtmlPagesConverter converter = getHtmlPagesConverter(oneLine);
        assertThat(converter.getHtmlPage(1), is("Hello<br />Ciao<br />"));
    }

    @Test
    public void should_skip_page_break() throws IOException {
        String oneLine = "Hello\nPAGE_BREAK\nCiao";
        HtmlPagesConverter converter = getHtmlPagesConverter(oneLine);
        assertThat(converter.getHtmlPage(1), is("Hello<br />"));
    }

    private HtmlPagesConverter getHtmlPagesConverter(String oneLine) throws IOException {
        ReaderFactory readerFactory = new StringReaderFactory(oneLine);
        return new HtmlPagesConverter(readerFactory);
    }
}
