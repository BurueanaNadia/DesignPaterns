package laborator5;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;



public class ImageP implements Element, PictureP{
    private String url;
    private PictureContent pictureContent = new PictureContent();
    ImageLoaderFactory ilf;


    public ImageP(String url) {
        super();
        this.url = url;
    }


    public ImageP(String url,PictureContent pictureContent) {
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
        return this.pictureContent;
    }


}
