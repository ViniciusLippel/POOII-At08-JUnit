/*package scriptDB;

import junit.framework.TestCase;
import org.junit.jupiter.api.*;

public class JUnitTests extends TestCase{
	
	Column c = new Column();
    
	@Test
	public void ColScript1() {
		c = new Column("id", EType.INT, true, true);
		assertEquals("id INT NOT NULL AUTO_INCREMENT", c.generateScript());
	}
	
	@Test
	public void ColScript2() {
		c = new Column("nome", EType.VARCHAR, true, false);
		assertEquals("nome VARCHAR NOT NULL", c.generateScript());
	}
	
	@Test
	public void ColScript3() {
		c = new Column("idade", EType.INT, false, false);
		assertEquals("nome VARCHAR", c.generateScript());
	}
	
	@Test
	public void ColScript4() {
		c = new Column("nome", EType.VARCHAR, true, true);
		assertEquals("nome VARCHAR NOT NULL", c.generateScript());
	}
}*/
