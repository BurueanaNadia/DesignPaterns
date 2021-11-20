package laborator5;



public class ParagraphS implements Element{
	   private String text;
	   AlignStrategy alig;
       
	public ParagraphS(String text) {
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
	
	}