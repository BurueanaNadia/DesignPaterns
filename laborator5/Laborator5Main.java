package laborator5;

public class Laborator5Main {
    public static void main(String[] args) throws Exception {
        System.out.println("***************Strategy*******************\n");
        Section cap1 = new Section("Capitolul 1");

        ParagraphS p1 = new ParagraphS("Paragraph 1");
        cap1.add(p1);
        ParagraphS p2 = new ParagraphS("Paragraph 2");
        cap1.add(p2);
        ParagraphS p3 = new ParagraphS("Paragraph 3");
        cap1.add(p3);
        ParagraphS p4 = new ParagraphS("Paragraph 4");
        cap1.add(p4);
        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();
        p1.setAlignStrategy(new AlignCenterS());
        p2.setAlignStrategy(new AlignRightS());
        p3.setAlignStrategy(new AlignLeftS());

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
    }
}
