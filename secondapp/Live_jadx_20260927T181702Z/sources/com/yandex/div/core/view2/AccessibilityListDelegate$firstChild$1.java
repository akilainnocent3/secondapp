package com.yandex.div.core.view2;

import android.view.View;
import kotlin.jvm.internal.i0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class AccessibilityListDelegate$firstChild$1 extends i0 implements ds.l<View, Integer> {
    public static final AccessibilityListDelegate$firstChild$1 INSTANCE = new AccessibilityListDelegate$firstChild$1();

    public AccessibilityListDelegate$firstChild$1() {
        super(1, View.class, "getTop", "getTop()I", 0);
    }

    @Override // ds.l
    @oy.l
    public final Integer invoke(@oy.l View view) {
        return Integer.valueOf(view.getTop());
    }
}
