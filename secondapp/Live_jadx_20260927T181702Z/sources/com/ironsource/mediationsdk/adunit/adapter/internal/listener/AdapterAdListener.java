package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdapterErrorType;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface AdapterAdListener {
    void onAdClicked();

    void onAdClicked(@l Map<String, Object> map);

    void onAdLoadFailed(@l AdapterErrorType adapterErrorType, int i10, String str);

    void onAdLoadFailed(@l AdapterErrorType adapterErrorType, int i10, String str, @l Map<String, Object> map);

    void onAdLoadSuccess();

    void onAdLoadSuccess(@l Map<String, Object> map);

    void onAdOpened();

    void onAdOpened(@l Map<String, Object> map);

    void onAdShowFailed(int i10, String str);

    void onAdShowFailed(int i10, String str, @l Map<String, Object> map);
}
