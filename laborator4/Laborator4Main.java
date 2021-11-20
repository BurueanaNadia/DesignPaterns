package laborator4;
public class Laborator4Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

		/*long startTime = System.currentTimeMillis();
		//creare imagini
		Image img1 = new Image("Pamela Anderson");
		Image img2 = new Image("Kim Kardashian");
		Image img3 = new Image("Kirby Griffin");
		//creare 2 sectiuni in prima adaug img1 in a 2a sectiune adaug img2 si img3
		Section playboyS1 = new Section("Front Cover");
		playboyS1.add(img1);
		Section playboyS2 = new Section("Summer Girls");
		playboyS2.add(img2);
		playboyS2.add(img3);

		//creare carte
		Book playboy = new Book("Playboy");
        //adaug cartii cele 2 sectiuni
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
		startTime) + " milliseconds");*/


        long startTime = System.currentTimeMillis();
        ImageProxy img1 = new ImageProxy("Pamela Anderson");
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

