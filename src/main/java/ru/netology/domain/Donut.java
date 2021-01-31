package ru.netology.domain;

public class Donut {
    private Boolean isDonut; /*запись доступна только платным подписчикам VK Donut*/
    private Integer paidDuration; /*время, в течение которого запись будет доступна только платным подписчикам VK Donut*/
    private Boolean canPublishFreeCopy; /*можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut*/
    private String editMode; /*информация о том, какие значения VK Donut можно изменить в записи*/


    private Placeholder[] placeholder; /*описание места*/

    public Placeholder[] getPlaceholderForDisplay() {

        return null;
    }


}
