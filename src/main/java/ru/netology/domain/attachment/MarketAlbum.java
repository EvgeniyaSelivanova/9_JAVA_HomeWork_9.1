package ru.netology.domain.attachment;

public class MarketAlbum {
    private Integer id;
    private Integer ownerId;
    private String title;
    private Integer count;
    private Integer updatedTime;

    private Photo[] photo;

    public Photo[] getPhotoForDisplay() {

        return null;
    }


}
