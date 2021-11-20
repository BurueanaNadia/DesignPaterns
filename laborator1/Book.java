package laborator1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Book {
    private String titleBook;
    private List<Paragraph> paragraph = new ArrayList<Paragraph>();
    private List<String> images = new LinkedList<String>();
    private List<String> tables = new ArrayList<String>();
    public Book(String titleBook) {
        super();
        this.titleBook = titleBook;
    }
    public void createNewParagraph(String string) {
        // TODO Auto-generated method stub
        Paragraph p = new Paragraph(string);
        this.paragraph.add(p);

    }
    public void createNewImage(String string) {
        // TODO Auto-generated method stub
        images.add(string);

    }
    public void createNewTable(String string) {
        // TODO Auto-generated method stub
        this.tables.add(string);
    }
    public void print() {
        // TODO Auto-generated method stub
        System.out.println( "Book : " + titleBook + " este compusa din: "+"\n");
        System.out.println("Paragraphe: ");
        for(Paragraph p:paragraph) {
            System.out.println(p);
        }
        System.out.println("\n" + "Images: ");
        for(String s : images) {
            System.out.println(s);
        }
        System.out.println("\n Tables: ");
        for(String t:tables) {
            System.out.println(t);
        }
    }



}

