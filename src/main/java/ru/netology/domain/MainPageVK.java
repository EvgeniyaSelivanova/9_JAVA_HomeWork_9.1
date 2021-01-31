package ru.netology.domain;

public class MainPageVK {
    private PostManager postManager;

    public String generatePosts() {
        Post[] posts = postManager.getPostsForDisplay();
        return null;
    }
}
