package laborator1;

public class Paragraph {
    private String paragraph;

    public Paragraph(String paragraph) {
        super();
        this.paragraph = paragraph;
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    @Override
    public String toString() {
        return "Paragraph [paragraph=" + paragraph + "]";
    }


}