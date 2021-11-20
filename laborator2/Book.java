package laborator2;

import java.util.LinkedList;
import java.util.List;

public class Book {
    private String title;
    //o carte contine capitole,continut -->aici voi avea o relatie de compozitie(capitolele,continutul nu pot exista daca cartea nu exista)
    //o carte are autori-->relatie de agregare(autorii pot exista daca book nu exista)
    private TableOfContents content = new TableOfContents();
    private List<Chapter> chapters = new LinkedList<Chapter>();
    private List<Author> autori = new LinkedList<Author>();
    public Book(String title) {
        this.title = title;
    }
    public Book(String title,TableOfContents content,List<Chapter> chapters) {
        this.title = title;
        this.content=content;
        this.chapters = chapters;
    }
    public void addAuthor(Author rpGheo) {
        // TODO Auto-generated method stub
        autori.add(rpGheo);
    }
    public int createChapter(String string) {
        // TODO Auto-generated method stub
        Chapter chapter = new Chapter(string);
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }
    public Chapter getChapter(int indexChapterOne) {
        // TODO Auto-generated method stub
        return chapters.get(indexChapterOne);
    }

    public void print() {
        System.out.println("Book: " + title);
        for(Chapter c:chapters) {
            c.print();
        }
        for(Author a:autori) {
            a.toString();
        }
    }


}
