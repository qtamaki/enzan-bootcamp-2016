package enzan;

import java.io.PrintStream;
import org.junit.Test;
import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * Rigourous Test :-)
     */
	@Test
    public void testApp()
    {
        PrintStream out = mock(PrintStream.class);
        System.setOut(out);
        App.main(new String[]{});
        verify(out).println("hello");
        verify(out).println("こんにちは");
        verify(out).println(125);
    }
}
