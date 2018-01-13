package com.myrockmansion.newsapp;

import java.util.ArrayList;
import java.util.List;

import com.myrockmansion.newsapp.model.Article;

public class NewsStore {
    private static List<Article> newsArticles = new ArrayList<>();

    public static List<Article> getNewsArticles() {
        return newsArticles;
    }

    public static void setNewsArticles(List<Article> newsArticles) {
        NewsStore.newsArticles = newsArticles;
    }
}
