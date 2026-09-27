package com.ironsource;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class rg {
    public static final boolean a(@oy.l View view, @oy.l Rect rect) {
        kotlin.jvm.internal.m0.p(view, "<this>");
        kotlin.jvm.internal.m0.p(rect, "rect");
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
