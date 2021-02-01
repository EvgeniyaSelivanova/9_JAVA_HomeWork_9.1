package ru.netology.domain.attachment;

import ru.netology.domain.Place;

import java.lang.reflect.Array;

public class Video {
    private Integer id;
    private Integer ownerId;
    private String title;
    private String description;
    private Integer duration;
    private Array image[];
    private Array firstFrame[];
    private Integer date;
    private Integer addingDate;
    private Integer views;
    private Integer localViews;
    private Integer comments;
    private String player;
    private String platform;
    private Integer canEdit;
    private Integer canAdd;
    private Integer isPrivate;
    private String accessKey;
    private Integer processing;
    private Boolean isFavorite;
    private Integer canComment;
    private Integer canEditVideo;
    private Integer canLike;
    private Integer canRepost;
    private Integer canSubscribe;
    private Integer canAddToFaves;
    private Integer canAttachLink;
    private Integer width;
    private Integer height;
    private Integer userId;
    private Integer converting;
    private Integer added;
    private Integer isSubscribed;
    private Integer repeat;
    private String type;
    private Integer balance;
    private String liveStatus;
    private Integer live;
    private Integer upcoming;
    private Integer spectators;

    private Like[] likes;

    public Like[] getLikes() {
        return null;
    }

    private Repost[] reposts;

    public Repost[] getReposts() {
        return null;
    }

}
