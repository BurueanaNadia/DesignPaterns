package laborator2;

import java.util.LinkedList;
import java.util.List;

public class SubChapter {
    private String subchapter;

    //subcapitolul contine paragraphe,imagini,tabele deci avem o compozitie
    private List<String> paragraphs = new LinkedList<String>();
    private List<String> images = new LinkedList<String>();
    private List<String> tables = new LinkedList<String>();

    public SubChapter(String subchapter) {
        super();
        this.subchapter = subchapter;
    }


    public SubChapter(String subchapter, List<String> paragraphs, List<String> images, List<String> tables) {
        super();
        this.subchapter = subchapter;
        this.paragraphs = paragraphs;
        this.images = images;
        this.tables = tables;
    }




    public void createNewParagraph(String string) {
        // TODO Auto-generated method stub
        paragraphs.add(string);

    }

    public void createNewImage(String string) {
        // TODO Auto-generated method stub
        images.add(string);
    }

    public void createNewTable(String string) {
        // TODO Auto-generated method stub
        tables.add(string);
    }

    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Subcapitol: " + subchapter);
        System.out.println("\n Paragraphs:");
        for(String p:paragraphs) {
            System.out.println(p);
        }
        System.out.println("\n Images:");
        for(String p:images) {
            System.out.println(p);
        }
        System.out.println("\n Tables:");
        for(String p:tables) {
            System.out.println(p);
        }
    }


}
