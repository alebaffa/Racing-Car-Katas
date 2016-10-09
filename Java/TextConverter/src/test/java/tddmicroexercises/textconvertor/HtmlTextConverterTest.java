package tddmicroexercises.textconvertor;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HtmlTextConverterTest {
    @Test
    public void should_return_the_filename() {
        HtmlTextConverter converter = new FakeHtmlTextConverter("foo");
        assertThat(converter.getFilename(), is("foo"));
    }

    @Test
    public void should_convert_to_html() throws IOException {
        HtmlTextConverter converter = new FakeHtmlTextConverter("ciao");
        assertThat(converter.convertToHtml(), is("ciao<br />"));
    }

}
