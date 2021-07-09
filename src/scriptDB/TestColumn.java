package scriptDB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import junit.framework.TestCase;

class TestColumn extends TestCase{
	
	Column c = new Column();
    
	@Test
	public void TestColScript1() {
		c = new Column("id", EType.INT, true, true);
		assertEquals("id INT NOT NULL AUTO_INCREMENT", c.generateScript());
	}
	
	@Test
	@DisplayName("VARCHAR NOT NULL")
	public void TestColScript2() {
		c = new Column("nome", EType.VARCHAR, true, false);
		assertEquals("nome VARCHAR NOT NULL", c.generateScript());
	}
	
	@Test
	@DisplayName("DATE")
	public void TestColScript3() {
		c = new Column("dtNasc", EType.DATE, false, false);
		assertEquals("dtNasc DATA", c.generateScript());
	}
	
	@Test
	public void TestColScript4() {
		c = new Column("nome", EType.VARCHAR, true, true);
		assertEquals("nome VARCHAR NOT NULL", c.generateScript());
	}

}
