package services;



public class ImageLoaderFactory {
    public static ImageLoader create(String url) {
    	if(url.toLowerCase().endsWith("jpg")) {
    		return new JPGImageLoader();
    	
    	}else if(url.toLowerCase().endsWith("bmp")) {
    		return new BMPImageLoader();
    	}
    	throw new RuntimeException("Unsuported format: " + url);
    }
}
