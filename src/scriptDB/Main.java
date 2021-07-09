package scriptDB;

public class Main {

	public static void main(String[] args) {
		
		Column c = new Column("nome", EType.VARCHAR, true, true);
		System.out.println(c.generateScript());
		
		c = new Column("", EType.INT, false, false);
		System.out.println(c.generateScript());
		
	}

}
