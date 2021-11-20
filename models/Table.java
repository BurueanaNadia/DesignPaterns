package models;



public class Table implements Element,Visitee{
    private String title;
    Visitor visitor = null;

	public Table(String title) {
		super();
		this.title = title;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Table: " + title);
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		this.visitor  = visitor;
		visitor.visitTable(this);
	}
    
}