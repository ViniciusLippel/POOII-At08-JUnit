package scriptDB;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Column c = new Column("nome", EType.VARCHAR, true, true);
		System.out.println(c.generateScript());
	}

}
