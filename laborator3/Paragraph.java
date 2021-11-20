package laborator3;

public class Paragraph implements Element{
    private String text;


    public Paragraph(String text) {
        super();
        this.text = text;
    }


    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Paragraph " + text);
    }

}
