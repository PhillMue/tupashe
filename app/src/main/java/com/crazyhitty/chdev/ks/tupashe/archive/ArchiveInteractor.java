package com.crazyhitty.chdev.ks.tupashe.archive;

import android.content.Context;

import com.crazyhitty.chdev.ks.tupashe.models.FeedItem;
import com.crazyhitty.chdev.ks.tupashe.utils.DatabaseUtil;

import java.util.List;

/**
 * Created by Kartik_ch on 12/9/2015.
 */
public class ArchiveInteractor implements IArchiveInteractor {
    public void retrieveArchiveFromDb(OnArticleRetrievedListener onArticleRetrievedListener, Context context) {
        DatabaseUtil databaseUtil = new DatabaseUtil(context);
        try {
            List<FeedItem> feedItems = databaseUtil.getSavedArticles();
            onArticleRetrievedListener.onSuccess(feedItems);
        } catch (Exception e) {
            e.printStackTrace();
            onArticleRetrievedListener.onFailure(e.getMessage());
        }
    }
}
