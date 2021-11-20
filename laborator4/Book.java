package laborator4;

import java.util.List;
import java.util.ArrayList;

public class Book implements Element{
    protected String title;
    protected List<Element> listaElemente = new ArrayList<>();//relatie de compozitie
    private  List<Author> listaAutori = new ArrayList<>();//relatie de agregare
    public Book(String title) {
        this.title = title;
    }
    public Book(String title,List<Element> listaElemente2) {
        super();
        this.title = title;
        this.listaElemente = listaElemente2;
    }

    public void addAuthor(Author rpGheo) {
        // TODO Auto-generated method stub
        listaAutori.add(rpGheo);

    }
    public void addContent(Element element) {
        // TODO Auto-generated method stub
        if(listaElemente.contains(element)) {
            throw new IllegalStateException("Elementul exista deja in lista!");
        }else
        {
            this.listaElemente.add(element);
        }
    }
    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Book: " + title + " contine: \n");
        System.out.println("Authors: ");
        for(Author a:listaAutori) {
            a.print();
        }
        System.out.println("\n");
        for(Element e:listaElemente) {
            e.print();
        }

    }


}


