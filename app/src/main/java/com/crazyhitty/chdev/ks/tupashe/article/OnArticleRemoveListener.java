package com.crazyhitty.chdev.ks.tupashe.article;

/**
 * Created by Kartik_ch on 12/15/2015.
 */
public interface OnArticleRemoveListener {
    void onArticleDeleted(String message);

    void onArticleDeletionFailed(String message);
}
