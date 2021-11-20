package laborator2;

import java.util.LinkedList;
import java.util.List;

public class Chapter {
    private String chapter;
    //pentru ca subcapitole nu au existenta de sine statatoare,nu pot exista fara capitole avem relatie de compozitie
    private List<SubChapter> subchapters = new LinkedList<SubChapter>();



    public Chapter(String chapter) {
        super();
        this.chapter = chapter;
    }

    public Chapter(String chapter, List<SubChapter> subchapters) {
        super();
        this.chapter = chapter;
        this.subchapters = subchapters;
    }

    @Override
    public String toString() {
        return "Chapter [chapter=" + chapter + "]";
    }

    public int createSubChapter(String string) {
        // TODO Auto-generated method stub
        SubChapter subchapter = new SubChapter(string);
        subchapters.add(subchapter);
        return this.subchapters.indexOf(subchapter);
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        // TODO Auto-generated method stub
        return this.subchapters.get(indexSubChapterOneOne);
    }
    public void print() {
        System.out.println("Chapter: " + chapter);
        for(SubChapter sc : subchapters) {
            sc.print();//aici am o relatie de delegare
        }
    }

}

