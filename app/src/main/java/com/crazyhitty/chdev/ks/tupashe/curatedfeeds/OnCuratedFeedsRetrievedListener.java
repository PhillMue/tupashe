package com.crazyhitty.chdev.ks.tupashe.curatedfeeds;

import com.crazyhitty.chdev.ks.tupashe.models.SourceItem;

import java.util.List;

/**
 * Created by Kartik_ch on 1/3/2016.
 */
public interface OnCuratedFeedsRetrievedListener {
    void onSuccess(List<SourceItem> sourceItems);

    void onFailure(String message);
}
