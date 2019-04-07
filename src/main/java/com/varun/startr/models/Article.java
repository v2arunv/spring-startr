package com.varun.startr.models;

public class Article {

    private final long id;
    private final String url;
    private final String content;

    public Article(long id, String url, String content) {
        this.id = id;
        this.url = url;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }

}
