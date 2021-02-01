package ru.netology.domain.attachment;

public class Link {
    private String url;
    private String title;
    private String caption;
    private String description;
    private String previewPage;
    private String previewUrl;

    private Photo[] photo;

    public Photo[] getPhotoForDisplay() {

        return null;
    }

    private Product[] product;

    public Product[] getProductForDisplay() {

        return null;
    }

    private ButtonLink[] buttonLink;

    public ButtonLink[] getButtonLinkForDisplay() {

        return null;
    }


}
