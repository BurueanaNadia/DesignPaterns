package services;
import java.util.HashMap;
import java.util.Map;

import models.*;
public class BookStatistics implements Visitor<Element>{
    Map<String,Integer> stats = new HashMap<>();
	

	@Override
	
	public Element visitBook(Book book) {
		
		Visitee v;
        for(Element e: book.getListaElemente()) {
            v = (Visitee) e;
            v.accept(this);
        }
        if(!this.stats.containsKey("Book:"))
            this.stats.put("Book:",1);
        else this.stats.put("Book:", this.stats.get("Book:") + 1);
		return null;
	}

	@Override
	public Element visitSection(Section section) {
		
		Visitee v;
        for(Element e: section.getListaElemente()) {
            v = (Visitee) e;
            v.accept(this);
        }
        for(ImageProxy f: section.getListaImageProxy()) {
            v = (Visitee) f;
            v.accept(this);
        }
        if(!this.stats.containsKey("Section:"))
            this.stats.put("Section:",1);
        else this.stats.put("Section:", this.stats.get("Section:") + 1);
		return null;
	}

	@Override
	public Element visitTableOfContents(TableOfContents tableOfContents) {
		// TODO Auto-generated method stub
		if(!this.stats.containsKey("TableOfContents:"))
            this.stats.put("TableOfContents:",1);
        else this.stats.put("TableOfContents:", this.stats.get("TableOfContents:") + 1);
		return null;
	}

	@Override
	public Element visitParagraph(Paragraph paragraph) {
		if(!this.stats.containsKey("Paragraph:"))
            this.stats.put("Paragraph:",1);
        else this.stats.put("Paragraph:", this.stats.get("Paragraph:") + 1);
		 return null;
	}

	@Override
	public Element visitImageProxy(ImageProxy ip) {
		// TODO Auto-generated method stub
		if(!this.stats.containsKey("ImageProxy:"))
            this.stats.put("ImageProxy:",1);
        else this.stats.put("ImageProxy:", this.stats.get("ImageProxy:") + 1);
		return null;
	}

	@Override
	public Element visitImage(Image image) {
		// TODO Auto-generated method stub
		if(!this.stats.containsKey("Image:"))
            this.stats.put("Image:",1);
        else this.stats.put("Image:", this.stats.get("Image:") + 1);
		return null;
		
	}

	@Override
	public Element visitTable(Table table) {
		// TODO Auto-generated method stub
		if(!this.stats.containsKey("Table:"))
            this.stats.put("Table:",1);
        else this.stats.put("Table:", this.stats.get("Table:") + 1);
		return null;
		
	}
	public void printStatistics() {
		for(String s:stats.keySet()) {
			System.out.println("******Number of " + s +":" + stats.get(s));
		}
	}
   
}
