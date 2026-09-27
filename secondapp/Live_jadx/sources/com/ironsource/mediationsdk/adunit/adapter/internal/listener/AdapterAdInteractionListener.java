package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface AdapterAdInteractionListener extends AdapterAdListener {
    void onAdClosed();

    void onAdClosed(@l Map<String, Object> map);

    void onAdEnded();

    void onAdEnded(@l Map<String, Object> map);

    void onAdStarted();

    void onAdStarted(@l Map<String, Object> map);

    void onAdVisible();

    void onAdVisible(@l Map<String, Object> map);
}
