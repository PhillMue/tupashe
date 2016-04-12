package com.crazyhitty.chdev.ks.tupashe.article;

import com.crazyhitty.chdev.ks.tupashe.models.FeedItem;

/**
 * Created by Kartik_ch on 12/2/2015.
 */
public interface IArticlePresenter {
    void attemptArticleLoading(String url);

    void archiveArticle(FeedItem feedItem, String article);

    void removeArticle(FeedItem feedItem);
}
