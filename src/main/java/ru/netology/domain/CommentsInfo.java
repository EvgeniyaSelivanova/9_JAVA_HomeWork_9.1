package ru.netology.domain;

public class CommentsInfo { /***информация о комментариях к записи, объект с полями*/
    private String ID;
    private String nameUserURL;
    private String date;
    private String time;
    private String description;
    private Integer like;
    private Boolean interest;
    private Integer count;  /*количество комментариев*/
    private Integer canPost;  /*информация о том, может ли текущий пользователь комментировать запись*/
    private Integer groupsCanPost;  /*информация о том, могут ли сообщества комментировать запись*/
    private Boolean canClose; /*может ли текущий пользователь закрыть комментарии к записи*/
    private Boolean canOpen; /*может ли текущий пользователь открыть комментарии к записи*/
}
