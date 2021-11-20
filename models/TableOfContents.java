package models;



public class TableOfContents implements Element,Visitee{
	  private int numarPagini;
      Visitor visitor = null;
	public TableOfContents(int numarPagini) {
		super();
		this.numarPagini = numarPagini;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("TableOfContents: " + numarPagini);
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		this.visitor = visitor;
		visitor.visitTableOfContents(this);
	}
	  
	}
