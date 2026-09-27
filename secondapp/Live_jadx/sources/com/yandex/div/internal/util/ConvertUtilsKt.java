package com.yandex.div.internal.util;

import com.yandex.div.core.annotations.InternalApi;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ConvertUtilsKt {
    @InternalApi
    @m
    public static final Boolean toBoolean(@l Number number) {
        return number instanceof Double ? toBoolean(number.doubleValue()) : toBoolean(number.intValue());
    }

    @InternalApi
    @m
    public static final Boolean toBoolean(int i10) {
        if (i10 == 0) {
            return Boolean.FALSE;
        }
        if (i10 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    private static final Boolean toBoolean(double d10) {
        if (d10 == 0.0d) {
            return Boolean.FALSE;
        }
        if (d10 == 1.0d) {
            return Boolean.TRUE;
        }
        return null;
    }
}
