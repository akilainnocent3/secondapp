package com.facebook.ads.internal.api;

import android.content.Context;
import androidx.annotation.Keep;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public interface AdSettingsApi {
    boolean isTestMode(Context context);

    void turnOnDebugger();
}
