package ru.netology.domain;

public class Post {
    private String ID;
    private Integer id; /*идентификатор записи со страницы Vk*/
    private Integer ownerId; /*идентификатор владельца стены со страницы Vk*/
    private Integer fromId; /*идентификатор автора записи со страницы Vk*/
    private Integer createdBy; /*идентификатор администратора, который опубликовал запись со страницы Vk*/
    private String logoGroupe;
    private String namePostURL;
    private String date; /***время публикации записи со страницы Vk*/
    private String time;
    private String description; /***текст записи со страницы Vk*/
    private Integer like;
    private Integer amountOfViews;
    private Boolean interest;
    private Integer replyOwnerId; /*идентификатор владельца записи, в ответ на которую была оставлена текущая со страницы Vk*/
    private Integer replyPostId; /*идентификатор записи, в ответ на которую была оставлена текущая со страницы Vk*/
    private Integer friendsOnly; /*идентификатор 1, если запись была создана с опцией «Только для друзей» со страницы Vk*/
    private String postType; /*тип записи*/
    private String signerId; /*идентификатор автора*/
    private Integer canPin; /*информация о том, может ли текущий пользователь закрепить запись*/
    private Integer canDelete; /*информация о том, может ли текущий пользователь удалить запись*/
    private Integer canEdit; /*информация о том, может ли текущий пользователь редактировать запись*/
    private Integer isPinned; /*информация о том, что запись закреплена*/
    private Integer markedAsAds; /*информация о том, содержит ли запись отметку "реклама"*/
    private Boolean isFavorite; /*true, если объект добавлен в закладки у текущего пользователя*/
    private Integer postponedId; /*идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере*/
}
