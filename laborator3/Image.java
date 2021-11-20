package laborator3;

public class Image implements Element{
    private String url;


    public Image(String url) {
        super();
        this.url = url;
    }


    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Image with name: " + url);
    }


}
