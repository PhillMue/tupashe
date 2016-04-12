package com.crazyhitty.chdev.ks.tupashe.archive;

import com.crazyhitty.chdev.ks.tupashe.models.FeedItem;

import java.util.List;

/**
 * Created by Kartik_ch on 12/9/2015.
 */
public interface OnArticleRetrievedListener {
    void onSuccess(List<FeedItem> feedItems);

    void onFailure(String message);
}
