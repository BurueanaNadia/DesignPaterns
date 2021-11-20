package models;

import java.util.ArrayList;
import java.util.List;



public class Section extends Book implements Element,Visitee{
	List<ImageProxy> listaImageProxy = new ArrayList<>();
	Visitor visitor = null;
	public Section(String title) {
    	super(title);
    }
	public Section(String title,List<Element> listaElemente) {
		super(title,listaElemente);
	}
		public List<Element> getListaElemente() {
			return super.getListaElemente();
		}

		
		
		// TODO Auto-generated constructor stub
	

	public List<ImageProxy> getListaImageProxy() {
			return listaImageProxy;
		}
		public void setListaImageProxy(List<ImageProxy> listaImageProxy) {
			this.listaImageProxy = listaImageProxy;
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
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		this.visitor = visitor;
		visitor.visitSection(this);
	}

}
