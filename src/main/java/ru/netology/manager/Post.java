package ru.netology.manager;

public class Post {
    private Integer ownerId; /*идентификатор пользователя или сообщества*/
    private String domain; /*короткий адрес пользователя или сообщества*/
    private String query; /*поисковой запрос*/
    private Integer ownersOnly; /*1 — возвращать только записи от имени владельца стены*/
    private Integer count; /*количество записей, которые необходимо вернуть*/
    private Integer offset; /*смещение, необходимо для получения определенного подмножества результатов*/
    private Integer postId; /*идентификатор записи на стене*/

}
