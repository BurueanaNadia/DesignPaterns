package laborator4;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;



public class Image implements Element, Picture{
    private String url;
    private PictureContent pictureContent = new PictureContent();


    public Image(String url) {
        super();
        this.url = url;
    }


    public Image(String url,PictureContent pictureContent) {
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
    public PictureContent content() {
        // TODO Auto-generated method stub
        return this.content();
    }


}

