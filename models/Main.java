package models;

import services.AlignCenter;
import services.AlignLeft;
import services.AlignRight;
import services.BookStatistics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************Strategy*******************\n");
		Section cap1 = new Section("Capitolul 1");
		
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		System.out.println("Printing without Alignment");
		System.out.println();
		cap1.print();
		p1.setAlignStrategy(new AlignCenter());
		p2.setAlignStrategy(new AlignRight());
		p3.setAlignStrategy(new AlignLeft());

		System.out.println();
		System.out.println("Printing with Alignment");
		System.out.println();
		cap1.print();
		
		System.out.println("\n*********************Factory*****************\n");
		long startTime = System.currentTimeMillis();
		ImageProxy img1 = new ImageProxy("Pamela Anderson.jpg");
		ImageProxy img2 = new ImageProxy("Kim Kardashian");
		ImageProxy img3 = new ImageProxy("Kirby Griffin");
		Section playboyS1 = new Section("Front Cover");
		playboyS1.add(img1);
		
		Section playboyS2 = new Section("Summer Girls");
		playboyS2.add(img2);
		playboyS2.add(img3);
		Book playboy = new Book("Playboy");
		playboy.addContent(playboyS1);
		playboy.addContent(playboyS2);
		long endTime = System.currentTimeMillis();
		System.out.println("Creation of the content took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing of the section 1 took " + (endTime -
		startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
		playboyS1.print();
		endTime = System.currentTimeMillis();
		System.out.println("Printing again the section 1 took " + (endTime -
		startTime) + " milliseconds");
		
		System.out.println("\n**************************Visitor****************");
		Section cp1 = new Section("Capitolul 1");
		Paragraph pa1 = new Paragraph("Paragraph 1");
		cp1.add(pa1);
		Paragraph pa2 = new Paragraph("Paragraph 2");
		cp1.add(pa2);
		Paragraph pa3 = new Paragraph("Paragraph 3");
		cp1.add(pa3);
		Paragraph pa4 = new Paragraph("Paragraph 4");
		cp1.add(pa4);
		cp1.add(new ImageProxy("ImageOne"));
		cp1.add(new Image("ImageTwo"));
		cp1.add(new Paragraph("Some text"));
		cp1.add(new Table("Table 1"));
		BookStatistics stats = new BookStatistics();
		cp1.accept(stats);
		stats.printStatistics();
	}

}
