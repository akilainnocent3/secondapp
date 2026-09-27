package com.google.ads.mediation.applovin;

import android.content.Context;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class zx {
    public AppLovinSdk zz(Context context) {
        return AppLovinSdk.getInstance(context);
    }

    public String zz() {
        return AppLovinSdk.VERSION;
    }
}
