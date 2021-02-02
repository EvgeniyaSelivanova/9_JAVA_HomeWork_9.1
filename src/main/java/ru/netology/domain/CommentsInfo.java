package ru.netology.domain;

public class CommentsInfo { /***информация о комментариях к записи, объект с полями*/
    private String ID;
    private String nameUserURL;
    private String date;
    private String time;
    private String description;
    private int like;
    private boolean interest;
    private int count;  /*количество комментариев*/
    private boolean canPost;  /*информация о том, может ли текущий пользователь комментировать запись*/
    private boolean groupsCanPost;  /*информация о том, могут ли сообщества комментировать запись*/
    private boolean canClose; /*может ли текущий пользователь закрыть комментарии к записи*/
    private boolean canOpen; /*может ли текущий пользователь открыть комментарии к записи*/
}
