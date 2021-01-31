package ru.netology.domain;

public class Likes {
    private Integer count; /*число пользователей, которым понравилась запись*/
    private Integer userLikes; /*наличие отметки «Мне нравится» от текущего пользователя*/
    private Integer canLike; /*информация о том, может ли текущий пользователь поставить отметку «Мне нравится»*/
    private Integer canPublish; /*информация о том, может ли текущий пользователь сделать репост записи*/

}
