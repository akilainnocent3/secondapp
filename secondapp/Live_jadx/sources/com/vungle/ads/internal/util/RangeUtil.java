package com.vungle.ads.internal.util;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class RangeUtil {

    @l
    public static final RangeUtil INSTANCE = new RangeUtil();

    private RangeUtil() {
    }

    public static /* synthetic */ boolean isInRange$default(RangeUtil rangeUtil, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return rangeUtil.isInRange(i10, i11, i12);
    }

    public final boolean isInRange(float f10, float f11, float f12) {
        return f11 <= f10 && f10 <= f12;
    }

    public static /* synthetic */ boolean isInRange$default(RangeUtil rangeUtil, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f12 = Float.MAX_VALUE;
        }
        return rangeUtil.isInRange(f10, f11, f12);
    }

    public final boolean isInRange(int i10, int i11, int i12) {
        return i11 <= i10 && i10 <= i12;
    }
}
