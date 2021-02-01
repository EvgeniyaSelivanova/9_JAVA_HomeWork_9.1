package ru.netology.domain.attachment;

import ru.netology.domain.Place;

import java.net.Inet4Address;

public class Doc {
    private Integer id;
    private Integer ownerId;
    private String title;
    private Integer size;
    private String ext;
    private String url;
    private Integer date;
    private Integer type;

    private Preview[] preview;

    public Preview[] getPreviewForDisplay() {

        return null;
    }







}
