package com.yandex.div.core.widget;

import ds.l;
import kotlin.jvm.internal.o0;
import ms.u;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AspectView$Companion$aspectRatioProperty$1 extends o0 implements l<Float, Float> {
    public static final AspectView$Companion$aspectRatioProperty$1 INSTANCE = new AspectView$Companion$aspectRatioProperty$1();

    public AspectView$Companion$aspectRatioProperty$1() {
        super(1);
    }

    @oy.l
    public final Float invoke(float f10) {
        return Float.valueOf(u.t(f10, 0.0f));
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ Float invoke(Float f10) {
        return invoke(f10.floatValue());
    }
}
