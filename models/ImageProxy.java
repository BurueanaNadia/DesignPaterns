package models;

import java.awt.Dimension;



public class ImageProxy implements Element,Picture,Visitee{
    private String url;
    private Dimension dim = new Dimension(80,40);
    //aici nu mai am continutul imaginii PictureContent
    //aici vom avea un obiect de tip Image
    private Image image;
    Visitor visitor = null;
    
    
	public ImageProxy(String url) {
		super();
		this.url = url;
	}

	public ImageProxy(String url, Dimension dim) {
		super();
		this.url = url;
		this.dim = dim;
		image=null;
	}

	@Override
	public String url() {
		// TODO Auto-generated method stub
		return this.url;
		
	}

	@Override
	public Dimension dim() {
		// TODO Auto-generated method stub
		return image==null?dim:image.dim();
	}

	@Override
	public PictureContents content() {
		// TODO Auto-generated method stub
		return loadImage(url).content();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(url);
		
		
	}
	private Image loadImage(String url) {
		if(image == null) {
			image = new Image(url);
		}
		return image;
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		this.visitor = visitor;
		visitor.visitImageProxy(this);
	}
	

}

