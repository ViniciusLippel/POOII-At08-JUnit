package scriptDB;

public class Column {
	
	private String id;
	private EType type;
	private boolean notNull;
	private boolean autoIncrement;
	
	//Constructors
	public Column(String id, EType type, boolean notNull, boolean autoIncrement) {
		super();
		this.id = id;
		this.type = type;
		this.notNull = notNull;
		this.autoIncrement = autoIncrement;
	}
	
	public Column() {
		
	}
	
	
	//Getters & Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public EType getType() {
		return type;
	}
	public void setType(EType type) {
		this.type = type;
	}
	public boolean isNotNull() {
		return notNull;
	}
	public void setNotNull(boolean notNull) {
		this.notNull = notNull;
	}
	public boolean isAutoIncrement() {
		return autoIncrement;
	}
	public void setAutoIncrement(boolean autoIncrement) {
		this.autoIncrement = autoIncrement;
	}
	
	
	//Methods
	public String generateScript() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.id + " ");
		sb.append(this.type);
		if(this.notNull)
			sb.append(" NOT NULL");
		if(this.autoIncrement)
			sb.append(" AUTO_INCREMENT");
		
		return sb.toString();
	}
	
	
	//To String
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Column [id=");
		builder.append(id);
		builder.append(", type=");
		builder.append(type);
		builder.append(", notNull=");
		builder.append(notNull);
		builder.append(", autoIncrement=");
		builder.append(autoIncrement);
		builder.append("]");
		return builder.toString();
	}
	
	
}
