package proxy.virtualproxy;

import proxy.virtualproxy.Image;

public class RealImage implements Image {
    private String url;

    public RealImage(String url) {
        this.url = url;
        System.out.println("Image loaded: " + this.url);
    }

    @Override
    public void showImage() {
        System.out.println("Image showed: " + this.url);
    }
}
