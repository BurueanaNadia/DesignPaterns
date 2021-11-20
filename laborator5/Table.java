package laborator5;



public class Table implements Element{
    private String title;

	public Table(String title) {
		super();
		this.title = title;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Table: " + title);
	}
    
}
