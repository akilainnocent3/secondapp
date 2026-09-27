package com.ironsource.mediationsdk.adunit.adapter.internal.listener;

import android.view.View;
import android.widget.FrameLayout;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface AdapterAdViewListener extends AdapterAdListener {
    void onAdLeftApplication();

    void onAdLeftApplication(Map<String, Object> map);

    void onAdLoadSuccess(@l View view, @l FrameLayout.LayoutParams layoutParams);

    void onAdLoadSuccess(@l View view, @l FrameLayout.LayoutParams layoutParams, Map<String, Object> map);

    void onAdScreenDismissed();

    void onAdScreenDismissed(Map<String, Object> map);

    void onAdScreenPresented();

    void onAdScreenPresented(Map<String, Object> map);
}
