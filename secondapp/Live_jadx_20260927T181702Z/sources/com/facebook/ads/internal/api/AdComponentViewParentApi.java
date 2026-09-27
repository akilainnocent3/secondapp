package com.facebook.ads.internal.api;

import android.view.View;
import androidx.annotation.Keep;
import k.g1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@Keep
@g1
public interface AdComponentViewParentApi extends AdComponentView {
    void bringChildToFront(View view);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    void onMeasure(int i10, int i11);

    void onVisibilityChanged(View view, int i10);

    void setMeasuredDimension(int i10, int i11);
}
