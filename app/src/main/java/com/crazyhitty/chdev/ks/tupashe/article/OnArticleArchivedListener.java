package com.crazyhitty.chdev.ks.tupashe.article;

/**
 * Created by Kartik_ch on 12/9/2015.
 */
public interface OnArticleArchivedListener {
    void onArticleSaved(String message);

    void onArticleSavingFailed(String message);
}
