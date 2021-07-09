package scriptDB;

import org.junit.jupiter.api.*;
import junit.framework.TestCase;


class TestColumn extends TestCase{
	
	Column c;
    
	//Com tipo, not null e auto increment
	@Test
	@DisplayName("Tipo, not null e auto increment")
	public void Test1() {
		c = new Column("id", EType.INT, true, true);
		assertEquals("id INT NOT NULL AUTO_INCREMENT", c.generateScript());
	}
	
	//Apenas com tipo e not null
	@Test
	@DisplayName("Tipo e not null")
	public void Test2() {
		c = new Column("nome", EType.VARCHAR, true, false);
		assertEquals("nome VARCHAR NOT NULL", c.generateScript());
	}
	
	//Apenas com tipo e auto increment
	@Test
	@DisplayName("Tipo e auto increment")
	public void Test3() {
		c = new Column("dtNasc", EType.DATE, false, true);
		assertEquals("dtNasc DATE AUTO_INCREMENT", c.generateScript());
	}
	
	//Apenas com tipo
	@Test
	@DisplayName("Apenas tipo")
	public void Test4() {
		c = new Column("salario", EType.DOUBLE, false, false);
		assertEquals("salario DOUBLE", c.generateScript());
	}
	
	//Com id vazio ou nulo (não deve gerar script)
	@Test
	@DisplayName("Id vazio ou nulo")
	public void Test5() {
		c = new Column ("", EType.INT, false, false);
		assertEquals("", c.generateScript());
		c = new Column (null, EType.INT, false, false);
		assertEquals("", c.generateScript());
	}
	
	//Tipo nulo (não deve gerar script)
	@Test
	@DisplayName("Tipo nulo")
	public void Test6() {
		c = new Column("Id", null, false, false);
		assertEquals("", c.generateScript());
	}
}
