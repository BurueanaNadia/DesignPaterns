package models;

import java.util.ArrayList;
import java.util.List;

import services.AlignStrategy;
import services.Context;

public class Paragraph implements Element,Visitee{
	   private String text;
	   AlignStrategy alig;
	   Visitor visitor = null;
	
    
	public Paragraph(String text) {
		super();
		this.text = text;
		
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		if(alig == null) {
			System.out.println("Paragraph " + this.text);
		}
		else
			alig.render(text, new Context());
		
	}
	
	public void setAlignStrategy(AlignStrategy alignStrategy){
	     this.alig = alignStrategy;
	      
		
	}


	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		this.visitor=visitor;
		visitor.visitParagraph(this);
	}
	
	}