package com.ironsource;

import android.app.Activity;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface I8 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void onNativeAdClicked();

        void onNativeAdLoadFailed(@oy.l String str);

        void onNativeAdLoadSuccess(@oy.l G8 g10);

        void onNativeAdShown();
    }

    void a();

    void a(@oy.l Activity activity, @oy.l JSONObject jSONObject);

    void a(@oy.m a aVar);

    void a(@oy.l J8 j10);

    @oy.m
    a b();

    @oy.m
    G8 c();
}
