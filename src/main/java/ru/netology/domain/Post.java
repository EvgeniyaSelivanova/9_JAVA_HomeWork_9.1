package ru.netology.domain;

public class Post {
    private String ID;
    private int id; /*идентификатор записи со страницы Vk*/
    private int ownerId; /*идентификатор владельца стены со страницы Vk*/
    private int fromId; /*идентификатор автора записи со страницы Vk*/
    private int createdBy; /*идентификатор администратора, который опубликовал запись со страницы Vk*/
    private String logoGroupe;
    private String namePostURL;
    private int date; /***время публикации записи со страницы Vk*/
    private String time;
    private String text; /***текст записи со страницы Vk*/
    private int like;
    private int amountOfViews;
    private boolean interest;
    private int replyOwnerId; /*идентификатор владельца записи, в ответ на которую была оставлена текущая со страницы Vk*/
    private int replyPostId; /*идентификатор записи, в ответ на которую была оставлена текущая со страницы Vk*/
    private int friendsOnly; /*идентификатор 1, если запись была создана с опцией «Только для друзей» со страницы Vk*/
    private String postType; /*тип записи*/
    private int signerId; /*идентификатор автора*/
    private boolean canPin; /*информация о том, может ли текущий пользователь закрепить запись*/
    private boolean canDelete; /*информация о том, может ли текущий пользователь удалить запись*/
    private boolean canEdit; /*информация о том, может ли текущий пользователь редактировать запись*/
    private int isPinned; /*информация о том, что запись закреплена*/
    private boolean markedAsAds; /*информация о том, содержит ли запись отметку "реклама"*/
    private boolean isFavorite; /*true, если объект добавлен в закладки у текущего пользователя*/
    private int postPonedId; /*идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере*/
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private CopyrightInfo copyrightInfo;
    private PostSourceInfo postSourceInfo;
    private GeoInfo geoInfo;
    private DonutInfo donutInfo;
}
