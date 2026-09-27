package com.yandex.div.core.widget;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.yandex.div.core.annotations.PublicApi;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public interface DivViewDelegate {
    void buildDrawingCache(boolean z10);

    @l
    Drawable invalidateDrawable(@l Drawable drawable);

    void onAttachedToWindow();

    void onDetachedFromWindow();

    boolean onVisibilityChanged(@l View view, int i10);

    void unscheduleDrawable(@m Drawable drawable);
}
