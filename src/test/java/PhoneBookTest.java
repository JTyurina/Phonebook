import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

import java.util.ArrayList;


public class PhoneBookTest extends Assert {
    private Phonebook phb;
    @Before
    public void init() {
        phb = new Phonebook();
    }

    @After
    public void tearDown() {
        phb = null;
    }

    @Test
    public void calls() {
        assertTrue(phb.getPhbook().containsKey("Иванов И.И"));
        assertFalse(phb.getPhbook().containsKey("Пупкин А.А."));

        ArrayList<String> arrTest = new ArrayList<String>();
        arrTest.add("+8 800 2000 700");
        assertEquals(arrTest, phb.getPhbook().get("Петров П.П."));

    }
}
