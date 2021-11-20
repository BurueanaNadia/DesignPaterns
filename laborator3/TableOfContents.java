package laborator3;

public class TableOfContents implements Element{
    private int numarPagini;

    public TableOfContents(int numarPagini) {
        super();
        this.numarPagini = numarPagini;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("TableOfContents: " + numarPagini);
    }

}

