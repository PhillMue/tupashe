package com.crazyhitty.chdev.ks.tupashe.sources;

import com.crazyhitty.chdev.ks.tupashe.models.SourceItem;

import java.util.List;

/**
 * Created by Kartik_ch on 11/18/2015.
 */
public interface OnSourcesLoadedListener {
    void onSourceLoaded(List<String> sourceNames);

    void onSourceItemsLoaded(List<SourceItem> sourceItems);

    void onSourceLoadingFailed(String message);
}
