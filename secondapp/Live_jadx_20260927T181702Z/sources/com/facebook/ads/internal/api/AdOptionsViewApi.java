package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import com.facebook.ads.AdClosedListener;
import k.g1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@g1
public interface AdOptionsViewApi extends AdComponentViewApiProvider {
    void setIconColor(int i10);

    void setIconSizeDp(int i10);

    void setOnAdClosedListener(AdClosedListener adClosedListener);

    void setSingleIcon(boolean z10);
}
