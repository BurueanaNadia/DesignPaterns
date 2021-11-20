package laborator5;

import java.util.ArrayList;
import java.util.List;



public class Section extends Book implements Element{
	private List<ImageProxy> listaImageProxy = new ArrayList<>();
	public Section(String title) {
    	super(title);
    }
	public Section(String title,List<Element> listaElemente) {
		super(title,listaElemente);
		
		
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(title);
		for(Element e:listaElemente) {
			e.print();
		}
		for(ImageProxy ip:listaImageProxy) {
			ip.print();
		}
		
	}
	public void add(Element element) {
    	if(listaElemente.contains(element)) {
    		throw new IllegalStateException("Elementul exista deja in lista!");
    	}else
    	{
    		listaElemente.add(element);
    	}
    }
	public void add(ImageProxy imageProxy) {
    	if(listaImageProxy.contains(imageProxy)) {
    		throw new IllegalStateException("Elementul exista deja in lista!");
    	}else
    	{
    		listaImageProxy.add(imageProxy);
    	}
    }
	
	public void remove(Element element) {
		if(listaElemente.contains(element)) {
    		listaElemente.remove(element);
    	}else
    	{
    		throw new IllegalStateException("Elementul nu exista in lista!");
    	}
	}
	public Element get(int index) {
		return listaElemente.get(index);
	}

}
