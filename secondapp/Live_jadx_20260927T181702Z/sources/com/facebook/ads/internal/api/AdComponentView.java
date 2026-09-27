package com.facebook.ads.internal.api;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import k.g1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@g1
public interface AdComponentView {
    void addView(View view);

    void addView(View view, int i10);

    void addView(View view, int i10, int i11);

    void addView(View view, int i10, ViewGroup.LayoutParams layoutParams);

    void addView(View view, ViewGroup.LayoutParams layoutParams);

    void onWindowFocusChanged(boolean z10);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);
}
