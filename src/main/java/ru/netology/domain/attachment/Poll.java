package ru.netology.domain.attachment;

import java.lang.reflect.Array;

public class Poll {
    private Integer id;
    private Integer ownerId;
    private Integer created;
    private String question;
    private Integer votes;
    private Array answers[];
    private Boolean anonymous;
    private Boolean multiple;
    private Array answerIds[];
    private Integer endDate;
    private Boolean closed;
    private Boolean isBoard;
    private Boolean canEdit;
    private Boolean canVote;
    private Boolean canReport;
    private Boolean canShare;
    private Integer authorId;
    private Array friends[];

    private Photo[] photo;

    public Photo[] getPhotoForDisplay() {

        return null;
    }

    private Background[] background;

    public Background[] getBackgroundForDisplay() {

        return null;
    }


}
