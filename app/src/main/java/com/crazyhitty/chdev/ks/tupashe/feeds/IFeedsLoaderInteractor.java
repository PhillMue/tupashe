package com.crazyhitty.chdev.ks.tupashe.feeds;

import com.crazyhitty.chdev.ks.tupashe.models.SourceItem;

import java.util.List;

/**
 * Created by Kartik_ch on 11/5/2015.
 */
public interface IFeedsLoaderInteractor {
    void loadFeedsFromDb(final OnFeedsLoadedListener onFeedsLoadedListener);

    void loadFeedsFromDbBySource(final OnFeedsLoadedListener onFeedsLoadedListener, String source);

    void loadFeedsAsync(OnFeedsLoadedListener onFeedsLoadedListener, List<SourceItem> sourceItems);
}
