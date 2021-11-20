package models;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import services.ImageLoaderFactory;



public class Image implements Element, Picture,Visitee{
    private String url;
    private PictureContents pictureContent = new PictureContents();
    ImageLoaderFactory ilf;
    Visitor visitor = null;
    
    
	public Image(String url) {
		super();
		this.url = url;
	}


	public Image(String url,PictureContents pictureContent) {
		super();
		this.url = url;
		this.pictureContent = pictureContent;
		try {
			TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Image with name: " + url);
		pictureContent.print();
	}


	@Override
	public String url() {
		// TODO Auto-generated method stub
		return this.url;
	}


	@Override
	public Dimension dim() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public PictureContents content() {
		// TODO Auto-generated method stub
		return this.pictureContent;
	}


	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		this.visitor = visitor;
		visitor.visitImage(this);
	}
	

}
