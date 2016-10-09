package tddmicroexercises.textconvertor;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HtmlTextConverterTest {
    @Test
    public void should_return_the_filename() {
        HtmlTextConverter converter = new HtmlTextConverter("foo");
        assertThat(converter.getFilename(), is("foo"));
    }
}
