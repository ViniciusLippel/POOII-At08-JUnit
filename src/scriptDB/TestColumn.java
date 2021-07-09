package scriptDB;

import org.junit.Assert;
import org.junit.jupiter.api.*;
import junit.framework.TestCase;


class TestColumn extends TestCase{
	
	Column c;
    
	//Com tipo, not null e auto increment
	@Test
	@DisplayName("INT NOT NULL AUTO_INCREMENT")
	public void Test1() {
		c = new Column("id", EType.INT, true, true);
		assertEquals("id INT NOT NULL AUTO_INCREMENT", c.generateScript());
	}
	
	//Apenas com tipo e not null
	@Test
	@DisplayName("VARCHAR NOT NULL")
	public void Test2() {
		c = new Column("nome", EType.VARCHAR, true, false);
		assertEquals("nome VARCHAR NOT NULL", c.generateScript());
	}
	
	//Apenas com tipo e auto increment
	@Test
	@DisplayName("DATE AUTO_INCREMENT")
	public void Test3() {
		c = new Column("dtNasc", EType.DATE, false, true);
		assertEquals("dtNasc DATE AUTO_INCREMENT", c.generateScript());
	}
	
	//Apenas com tipo
	@Test
	@DisplayName("DOUBLE")
	public void Test4() {
		c = new Column("salario", EType.DOUBLE, false, false);
		assertEquals("salario DOUBLE", c.generateScript());
	}
	
}
