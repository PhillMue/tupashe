package com.crazyhitty.chdev.ks.tupashe.sources;

/**
 * Created by Kartik_ch on 11/7/2015.
 */
public interface OnSourceSavedListener {
    void onSuccess(String message);

    void onFailure(String message);
}
