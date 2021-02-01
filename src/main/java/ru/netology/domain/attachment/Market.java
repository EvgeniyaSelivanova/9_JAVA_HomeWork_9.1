package ru.netology.domain.attachment;

public class Market {
    private Integer id;
    private Integer ownerId;
    private String title;
    private String description;
    private Integer weight;
    private String thumbPhoto;
    private Integer date;
    private Integer availability;
    private Boolean isFavorite;
    private String sku;

    private Price[] price;

    public Price[] getPriceForDisplay() {

        return null;
    }

    private Dimension[] dimension;

    public Dimension[] getDimensionForDisplay() {

        return null;
    }

    private Category[] category;

    public Category[] getCategoryForDisplay() {

        return null;
    }


}
